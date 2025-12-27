
import java.util.NoSuchElementException;
class DoublyList<T>{
    Node<T> head;
    Node<T> tail;
    void addLast(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null)
            tail=head=newNode;
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

   void addFirst(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null)
            tail=head=newNode;
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
   }

   void addAtPosition(int pos,T data){
        Node<T> newNode=new Node<>(data);
        if(pos < 0)
           throw new IllegalArgumentException("Invalid position");
        // insert at beginning
        if(head==null || pos==0){
             newNode.next=head;
             if(head!=null)
                head.prev=newNode;
            head=newNode;
            if(tail==null)
                tail=newNode;
             return;
        }
        
        int i=0;
        Node<T> curr=head;
        while(curr.next!=null && i<pos-1){
            curr=curr.next;
            i++;
        }
        //insert at middle or end
        newNode.next=curr.next;
        newNode.prev=curr;
        curr.next=newNode;
        if(newNode.next!=null)
            newNode.next.prev=newNode;
        else    
            tail=newNode; //last node 

   }

   T removeFirst(){
        if(head==null)
            throw new NoSuchElementException("List is empty");
        T removed=head.data;
        if(head == tail){   // only one node
             head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removed;
   }

    T remove() {
        if(head==null)
            throw new NoSuchElementException("List is empty");
        T removed=tail.data;
        if(tail==head){
            tail=head=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        return removed;
    }

    boolean contains(T data){
        if(head==null)
            return false;
        Node<T> curr=head;
        while(curr!=null){
            if(curr.data.equals(data)){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
     void traverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node<T> curr=head;
        System.out.println("Elements of the list");
        while(curr.next!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.print(curr.data+"\n");
    
    }
}
class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    Node(T data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}


public class MainDoubly {
    public static void main(String[] args) {

        DoublyList<Integer> obj=new DoublyList<>();
        obj.addFirst(10);
        obj.addAtPosition(1, 20);
        obj.addLast(30);
        System.out.println("Elemets exists 10 "+obj.contains(10));
        
        obj.traverse();

        System.out.println("remove first ele "+obj.removeFirst());
        System.out.println("remove lasr ele "+obj.remove());
        System.out.println("Elemets exists 10 "+obj.contains(10));

    }
}
