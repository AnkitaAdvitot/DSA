import java.util.Arrays;

class CheckOverlapExists{

    static boolean isOverlapExists(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=intervals[i-1][1])
                return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{4,6},{8,10}};
        System.out.println(isOverlapExists(intervals));
    }
}