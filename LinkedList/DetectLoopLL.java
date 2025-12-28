import java.util.HashMap;

public class DetectLoopLL {
    public boolean brute(ListNode head) {
        HashMap<ListNode,Boolean>map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,true);
            temp=temp.next;
        } 
        return false;
    }

    // optimal
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 