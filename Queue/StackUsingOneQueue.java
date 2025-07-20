
import java.util.LinkedList;
import java.util.Queue;

class StackUsingOneQueue{
    Queue<Integer> que;
    StackUsingOneQueue(){
        que=new LinkedList<>();
    }

     void push(int ele){
        que.add(ele);
        System.out.printf("%d Element added\n",ele);
    }
    int pop(){
        for(int i=0;i<que.size()-1;i++){
            que.add(que.poll());
        }
        int ele=que.poll();
        System.out.printf("%d element removed\n",ele);
        return ele;
    }
    int peek(){
        for(int i=0;i<que.size()-1;i++){
            que.add(que.poll());
        }
        int ele=que.peek();
        System.out.printf("%d element at top \n",ele);
        return ele;
    }
    public static void main(String[] args) {
        StackUsingOneQueue st=new StackUsingOneQueue();
        st.push(10);
        st.push(20);
        st.pop();
        st.peek();
    }
}