import java.util.Arrays;
import java.util.Scanner;

class AllPermutations{
   static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
   static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }
    static boolean nextPermutation(int[] arr) {
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i<0){
            return false;
        }
        int j=arr.length-1;
        while(j>=0 && arr[j]<=arr[i])
            j--;
        swap(arr,i,j);
        reverse(arr,i+1,arr.length-1);
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        do { 
            System.out.println(Arrays.toString(arr));
        } while (nextPermutation(arr));
    }
}