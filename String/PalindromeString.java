import java.util.Scanner;
class PalindromeString{
    static boolean ispalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(!(s.charAt(left)==s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String ");
        String s=sc.next();
        System.out.println("Palindrome "+ispalindrome(s));

    }
}
