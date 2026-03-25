public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 13 ;
        n = n & n-1;
        System.out.println("n= "+n);
    }
}
