import java.util.Scanner;

public class Subsequences{
    static void subsequences(String str,int ind,String newString){
        if(str.length()==ind){
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(ind);
        subsequences(str, ind+1, newString+curr);
        subsequences(str, ind+1, newString);
        
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        subsequences(str, 0,"" );
    }
}