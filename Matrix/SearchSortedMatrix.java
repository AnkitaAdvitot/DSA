public class SearchSortedMatrix {
     public boolean searchMatrix(int[][] mat, int x) {
        int r=mat.length;
        int c=mat[0].length;
        int s=0,e=r*c-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int midV=mat[mid/c][mid%c];
            if(midV==x)
                return true;
            else if(midV>x)
                e=mid-1;
            else
                s=mid+1;
        }
        return false;
    }
}
