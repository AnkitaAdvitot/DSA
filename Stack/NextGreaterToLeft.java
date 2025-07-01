
import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterToLeft {
    
    static ArrayList<Integer> nextGreater(int[] arr){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if(st.isEmpty()){
                ans.add(-1);
            }
            else
                ans.add(st.peek());
            
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
       System.out.println("Next Greater Elements to Left are "+nextGreater(arr));
    }
}
