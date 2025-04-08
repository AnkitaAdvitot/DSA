
import java.util.Scanner;
public class BuyAndSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int profit=0;
        int maxNo=Integer.MIN_VALUE;
        int diff=0;
        for(int i=0;i<len;i++){
            if(arr[i]>maxNo){
                maxNo=arr[i];
                continue;
            }
           diff=maxNo-arr[i]; 
           if(profit<diff){
                profit=diff;
           }
        }
        System.out.println(profit);
    }
}
