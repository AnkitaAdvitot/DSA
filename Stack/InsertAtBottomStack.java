import java.util.Stack;

public class InsertAtBottomStack {
    static void insert(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int curr=st.pop();
        insert(st,ele);
        st.push(curr);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<5;i++)
            st.push(i);
        System.out.println(" Before adding Stack size "+st.size());
        insert(st,10);
        System.out.println(" After adding element Stack size "+st.size());
        while(!st.isEmpty())
            System.out.println(st.pop());
    }
}
