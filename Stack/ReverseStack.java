import java.util.Stack;

public class ReverseStack {

    static void insert(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int curr=st.pop();
        insert(st,ele);
        st.push(curr);
    }
    static void reverse(Stack<Integer> st){
        if(st.isEmpty())
            return;
        int ele=st.pop();
        reverse(st);
        insert(st,ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<5;i++)
            st.push(i);
        reverse(st);
        System.out.println("After Reverse");
        while(!st.isEmpty())
            System.out.println(st.pop());
    }
}
