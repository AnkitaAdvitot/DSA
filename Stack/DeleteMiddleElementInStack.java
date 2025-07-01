import java.util.Stack;

class DeleteMiddleElementInStack{
    static void delete(Stack<Integer> st,int count,int curr){
            if(count==curr){
                st.pop();
                return;
            }
            int ele=st.pop();
            delete(st,count,curr+1);
            st.push(ele);
    }
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<5;i++)
            st.push(i);
        int count;
        System.out.println(" Before Deleting Stack size "+st.size());
        if(st.size()%2!=0)
            count=st.size()/2+1;
        else    
            count=st.size()/2;
        delete(st,count,1);

        System.out.println(" After deleting Stack size "+st.size());
        while(!st.isEmpty())
            System.out.println(st.pop());
    }
}