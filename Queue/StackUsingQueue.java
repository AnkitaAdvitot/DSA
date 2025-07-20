
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueue() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    void push(int ele){
        q2.add(ele);
        while(!q1.isEmpty())
            q2.add(q1.poll());
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        System.out.printf("%d Element is added \n",ele);
    }
    int pop(){
        if(q1.isEmpty())
            return -1;
        System.out.println(q1.peek()+" is removed");
        return q1.poll();
    }
    int peek(){
        if(q1.isEmpty())
            return -1;
        int ele=q1.peek();
        System.out.println("Top at stack "+ele);
        return  ele;
    }
    void display(){
        int size=q1.size();
        for(int i=0;i<size;i++){
            int ele=q1.poll();
            q1.add(ele);
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        StackUsingQueue sq=new StackUsingQueue();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.pop();
        sq.peek();
        sq.display();
    }
}