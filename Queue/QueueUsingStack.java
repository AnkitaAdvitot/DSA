import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> st;
    QueueUsingStack(){
        st=new Stack<>();
    }
    void enqueue(int ele){
        if(st.isEmpty()){
            st.push(ele);
            System.out.printf(" %d Element added \n",ele);
            return;
        }
        int e=st.pop();
        enqueue(ele);
        st.push(e);
    }
    int dequeue(){
        if(st.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int ele=st.pop();
        System.out.printf(" %d Element removed\n",ele);

        return ele;
    }
    int peek(){
        if(st.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int ele=st.peek();
        System.out.printf(" %d Element at frot of queue\n",ele);

        return ele;
    }
    public static void main(String[] args) {
        QueueUsingStack que=new QueueUsingStack();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.dequeue();
        que.dequeue();
        que.peek();
    }   
}
