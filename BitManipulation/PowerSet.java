
import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        int n = arr.length;
        int subset = 1 << n;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int mask =0; mask<subset;mask++){
            ArrayList<Integer> sub = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((mask & (1<<j))!=0)
                    sub.add(arr[j]);
            }
            ans.add(sub);
        }
        System.out.println(ans);
    }
}
