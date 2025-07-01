
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextSmallerElement {
    static List<Integer> nextSmaller(int[] arr){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        st.push(-1);
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(st.peek()>=curr){
                st.pop();

            }
            ans.add(st.peek());
            st.push(curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,3};
        List<Integer> ans=nextSmaller(arr);
        Collections.reverse(ans);
        System.err.print(ans);
    }
}
