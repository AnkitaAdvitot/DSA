
import java.util.Scanner;

class ReverseString{
    public static void reverse(String str,int ind){
        if(ind==-1)
            return;
        System.out.print(str.charAt(ind));
        reverse(str, ind-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        reverse(str,str.length()-1);
    }
}