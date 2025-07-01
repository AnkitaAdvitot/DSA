import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    static List<Integer> nextGreater(int[] arr){
        Stack<Integer> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ans.add(-1);
            else    
                ans.add(st.peek());
            
            st.push(arr[i]);
        }
        return ans;
    } 
    static List<Integer> brute(int[] arr){
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ans.add(arr[j]);
                    flag=false;
                    break;
                }
                if(!flag)
                    ans.add(-1);
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        int[] arr={2,1,4,3};
        System.out.println("Using Brute Force Approach");
        List<Integer> ans=brute(arr);
        System.err.println(ans);

        ans=nextGreater(arr);
        Collections.reverse(ans);
        System.err.print("Using Stack "+ans);


    }
}
