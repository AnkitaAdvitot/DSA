
import java.util.Arrays;

public class CountNonOverlapping {

    static int countNonOverlapping(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>intervals[i-1][1])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{4,6},{5,10}};
        System.out.print(countNonOverlapping(intervals));
    }
}
