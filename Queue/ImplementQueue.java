import java.util.Scanner;

class ImplementQueue {

    static int[] arr;
    static int front, rear;

    ImplementQueue(int n) {
        arr = new int[n];
        front = -1;
        rear = -1;
    }

    static void enqueue(int ele) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        }
        arr[rear++] = ele;
        System.out.printf("%d Element is added\n", ele);
    }

    static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed=arr[front++];
        System.out.printf("%d removed\n",removed);
        if(front==rear){
            front=-1;
            rear=-1;
        }
        return removed;
    }

    static boolean isEmpty(){
        return (front==-1 || front==rear);
    }
    static boolean isFull(){

        return (rear==arr.length-1);
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
        int i=front;
        System.out.println("Queue Elements are ");
        while(i<rear){
            System.out.print(arr[i++]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int len = sc.nextInt();
        ImplementQueue impl = new ImplementQueue(len);
        peek();
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();
        dequeue();
        dequeue();
        dequeue();
        dequeue(); 
    }
}
