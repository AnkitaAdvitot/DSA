public class SearchInRowWiseSortedMatrix {
     public boolean searchRowMatrix(int[][] mat, int x) {
       
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            int s=0,e=c-1;
            if(mat[i][s]<=x && mat[i][e]>=x){
                while(s<=e){
                int mid=s+(e-s)/2;
                if(mat[i][mid]==x)
                    return true;
                else if(mat[i][mid]>x)
                    e=mid-1;
                else 
                    s=mid+1;
              }
              
            }
        }
        return false;
    }
}
