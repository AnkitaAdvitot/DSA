
import java.util.Scanner;

public class MinSumAndMaxSum {
    static StringBuilder str=new StringBuilder();
    static int solve(int len,int sum){
        while(sum>=0){
            int min=Math.min(9,sum);
            str.append(min);
            sum-=9;
        }
        return Integer.parseInt(str.toString());
    }
    static int rev(int max){
        int rev=0;
        while(max!=0){
            rev=rev*10+max%10;
            max/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int sum=sc.nextInt();
        if(sum>9*len || sum==0 && len>1)
            System.out.println("-1 -1");
        int max=solve(len,sum);
        int min=rev(max);

        System.out.println("Minimum is "+min+" Maximum is "+max);
    }
}
