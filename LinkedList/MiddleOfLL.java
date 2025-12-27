public class MiddleOfLL<T>{

    int len(Node<T> head){
        int i=0;
        Node<T> curr=head;
        while(curr!=null){
            i++;
            curr=curr.next;
        }
        return i;
    }
    Node<T> brute(Node<T> head){
         if (head == null || head.next == null) {
            return head;
        }
        int length=len(head);
        int mid=length/2;
        Node<T> curr=head;
        for(int i=0;i<mid;i++){
            curr=curr.next;
        }
        return curr;
    }
   
}
class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data=data;
        this.next=null;
    }
}
