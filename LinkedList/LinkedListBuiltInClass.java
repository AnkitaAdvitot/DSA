import java.util.LinkedList;

class LinkedListBuiltInClass{
    
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10); // adds last
        list.addFirst(20); // first
        list.addLast(30);
        list.add(1,8);

        for(int num:list){
            System.out.print(num+" ");
        }
        System.out.println();
        
        System.out.println("fisrt ele "+list.getFirst());
        System.out.println("last ele"+list.getLast());

        System.out.println(list.remove()); //remove first and returns 
        System.out.println(list.remove(1)); //remove index 1
        System.out.println(list.removeFirst()); //remove first 
        System.out.println(list.removeLast());
        
        System.out.println("is 10 exists ? "+list.contains(10));
        System.out.println("index of 30 "+list.indexOf(30));


    }
}