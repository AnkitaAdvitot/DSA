import java.util.Stack;

public class SortStack {

    static void insertSorted(Stack<Integer> st,int ele){
        if(st.isEmpty() || (!st.isEmpty() && st.peek()>ele)){
            st.push(ele);
            return;
        }
        int x=st.pop();
        insertSorted(st, ele);
        st.push(x);

    }
    static void sort(Stack<Integer> st){
        if(st.isEmpty())
            return;
        int ele=st.pop();
        sort(st);
        insertSorted(st, ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        for(int i=5;i>=1;i--)
            st.push(i);
        st.push(-2);
        sort(st);
        while(!st.isEmpty())
            System.out.println(st.pop());
    }
}
