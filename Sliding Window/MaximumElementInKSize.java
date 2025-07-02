import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class MaximumElementInKSize{
    
    static int[] maximumElement(int[] arr,int k){
        int i=0,j=0;
        int size=arr.length;
        Deque<Integer> dq=new LinkedList<>();
        int[] res=new int[size-k+1];
        int r=0;
        while(j<size){
            while(!dq.isEmpty() && dq.peekFirst()<j-i+1)
                dq.pollFirst();
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[j])
                dq.pollLast();
            dq.offerLast(j);
            res[r++]=dq.peekFirst();
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}