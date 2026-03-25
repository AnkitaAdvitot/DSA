public class CheckBitSet {
    public static void main(String[] args) {
        int n = 6,i=1,n1=6; 
        //1 << left shift
        if((n & (1<<i))!=0)
            System.out.println("Set bit");
        else
            System.out.println("Not Set bit");
        // 2 right shift 
        if(((n1>>i) & 1)!=0)
            System.out.println("Set bit");
        else
            System.out.println("Not Set bit");

    }
}
