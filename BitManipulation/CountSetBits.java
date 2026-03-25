public class CountSetBits {
     public static void main(String[] args) {
        int n = 13,cnt =0;
       while(n>0){

            cnt+=n&1;
            n=n>>1;
       }
        System.out.println("count= "+cnt);
    }
}
