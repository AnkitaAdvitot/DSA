import java.util.Scanner;

public class Permutation {

    static void printPerm(String str,String perm){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            printPerm(newString, perm+curr);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        printPerm(str, "");
    }
}
