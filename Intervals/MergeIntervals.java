
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    static List<int[]> merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] curr=intervals[0];
        List<int[]> res=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=curr[1]){
                curr[1]=Math.max(curr[1],intervals[i][1]);
            }
            else{
                res.add(curr);
                curr=intervals[i];
            }
        }
        res.add(curr);
        return res;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{4,6},{5,10}};
        List<int[]> merged=merge(intervals);
        for(int[] in:merged){
            System.out.println(Arrays.toString(in));
        }
    }
}
