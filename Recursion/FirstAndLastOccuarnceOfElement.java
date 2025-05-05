import java.util.Scanner;

public class FirstAndLastOccuarnceOfElement {
    
    static int first=-1;
    static int last=-1;

    public static void find(String str,int index,char target){
        if(index==str.length()){
            return;
        }
        if(str.charAt(index)==target){
            if(first==-1){
                first=index;
                last=index;
                
            }
            else{
                last=index;
            }
        }
        find(str,index+1,target);
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        char ch=sc.next().charAt(0);
        find(str,0,ch);
        System.out.println("First Occurance "+first+" Last occurance "+last);
    }
}
