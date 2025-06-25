
import java.util.Arrays;
import java.util.Scanner;

class MoveAllZeros{

    static void movezero(int[] arr){
        int nonzero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                int temp=arr[nonzero];
                arr[nonzero]=arr[i];
                arr[i]=temp;
                nonzero++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        movezero(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}