
import java.util.Stack;

public class ReverseLL{
     public ListNode brute(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(!st.isEmpty()){
            temp.val=st.pop();
            temp=temp.next;
        }
        return head;
    }

     public ListNode optimal(ListNode head) {
       ListNode prev=null;
       ListNode curr=head;
       ListNode forward;
       while(curr!=null){ 
        
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
       }
       return prev;
    }
}


   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 