import java.util.Scanner;

class CircularQueue{
      static int[] arr;
    static int front, rear,size;

    CircularQueue(int n) {
        CircularQueue.size=n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }
      static void enqueue(int ele) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1 ) {
            front = 0;
        }
        rear=(rear+1)%size;
        arr[rear] = ele;
        System.out.printf("%d Element is added\n", ele);
    }

    static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed=arr[front];
        System.out.printf("%d removed\n",removed);
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else    
            front=(front+1)%size;
        return removed;
    }

    static boolean isEmpty(){
        return (front==-1);
    }
    static boolean isFull(){

        return ((rear+1)%size==front);
    }
    static int peek(){
        if(isEmpty())
            return -1;
        return arr[front];
    }
    static void display(){
         if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue Elements are ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int len = sc.nextInt();
        new CircularQueue(len);
        peek();
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();
        dequeue();
        dequeue();
        dequeue();
        dequeue(); 
        enqueue(100);
    }
}