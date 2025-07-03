
import java.util.LinkedList;
import java.util.Queue;

public class QueueRevsersal {
    static void reverse(Queue<Integer> que){
         if(que.isEmpty()){
            return;
         }
         int ele=que.poll();
         reverse(que);
         que.add(ele);
    }
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<5;i++){
            que.add(i);
        }
        reverse(que);
        while(!que.isEmpty())
            System.out.println(que.poll());
    }
}
