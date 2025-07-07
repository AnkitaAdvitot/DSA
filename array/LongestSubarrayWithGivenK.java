import java.util.Scanner;

public class LongestSubarrayWithGivenK {
    static int longestSubarrayWithGivenK(int[] arr,int k){
        int max=Integer.MIN_VALUE;
        int i=0,j=0;
        int size=arr.length;
        int sum=0;
        while(j<size){
            sum+=arr[j];
            if(sum<k)
                j++;
            else if(sum==k){
                max=Math.max(max,j-i+1);
            }
            else if(sum>k){
                while(sum>k){
                    sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        return (max==Integer.MIN_VALUE)?-1:max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(longestSubarrayWithGivenK(arr,5));
    }
}
