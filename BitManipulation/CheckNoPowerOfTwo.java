public class CheckNoPowerOfTwo {
     public static void main(String[] args) {
        int n = 13;
       if((n& n-1)==0)
            System.out.println("Power of Two");
       else
            System.out.println("Not power of Two");
    }
}
