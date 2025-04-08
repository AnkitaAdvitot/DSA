
import java.util.Scanner;

public class GoodPrime {
    static int sum(int num){
        int sum=0;
        while(num!=0){
            int d=num%10;
            sum+=d;
            num/=10;
        }
        return sum;
    }
    static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        while(count!=k){
            n=n+1;
           
            int ans=sum(n);
            // System.out.print("n "+n+" ans "+ans);
            if(isPrime(ans))
                count++;
        }
        System.out.println(n);
    }
}
