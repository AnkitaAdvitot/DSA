
import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

    static int[] stock(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            ans[i]=(st.isEmpty()) ? i+1 : i-st.peek();
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
         int[] arr={1,3,2,4};
         int[] ans=stock(arr);
       System.out.println(Arrays.toString(ans));
    }
}
