
import java.util.NoSuchElementException;

 class CustomSinglyList<T> {
    private Node<T> head;
    private int size=0;
    
    public void add(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node<T> curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        size++;
    }
    public  void addFirst(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    // last
    public T remove(){
       
        if(head==null)
            throw new NoSuchElementException("List is Empty");
        
        Node<T> curr=head;
         T removed=null;
        if(head.next==null){
            removed=head.data;
            head=null;
            size--;
            return removed;
        }
        else{
            while(curr.next.next!=null){
                curr=curr.next;
            }
            removed=curr.next.data;
            curr.next=null;
        }
        return removed;
    }
    public T removeFirst(){
         if(head==null)
            throw new NoSuchElementException("List is Empty");
         T removed= head.data;
         head=head.next;
         size--;
         return removed;
    }

    public T get(int index){
        checkBounds(index);
        Node<T> curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.data;
    }
    public int size(){
        return size;
    }
    void checkBounds(int index){
        if(index<0 || index>=size)
            throw  new NoSuchElementException("No such element exits");
    }
    T getFirst(){
        if(head==null)
            throw new NoSuchElementException("List is Empty");
        return head.data;
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

    boolean search(T data){
        if(head==null)
            throw new NoSuchElementException("List is Empty ");
        Node<T> curr=head;
        while(curr!=null){
            if(curr.data==data)
                return true;
            curr=curr.next;
        }
        return false;
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

public class MainSingly{
    public static void main(String[] args) {
        CustomSinglyList<Integer> obj=new CustomSinglyList<>();
        obj.add(10);
        obj.addFirst(20);
        obj.add(30);
        System.out.println("Element at index 2 is "+obj.get(2));
        System.out.println("Elemets exists 10 "+obj.search(10));
        
        System.out.println("First element "+obj.getFirst());
        System.out.println("Size "+obj.size());
        obj.traverse();

        System.out.println("remove first ele "+obj.removeFirst());
        System.out.println("remove lasr ele "+obj.remove());
        System.out.println("Elemets exists 10 "+obj.search(10));

    }
}