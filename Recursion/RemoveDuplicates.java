import java.util.Scanner;

public class RemoveDuplicates {
    static int[] map=new int[26];
    static void remove(String str,int index,String newString){

        if(index==str.length()){
            System.out.println("Removed duplicates "+newString);
            return;
        }
        char ch=str.charAt(index);
        int i=ch-'a';
        if(map[i]==0){
            newString+=ch;
            map[i]=1;
        }
            remove(str, index+1, newString);
        
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        remove(str, 0, "");
    }
}
