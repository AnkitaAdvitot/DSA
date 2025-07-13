public class SearchInRowColumnInMatrix {
      public static boolean matSearch(int mat[][], int x) {
        int m=mat.length;
        int n=mat[0].length;
        int r=0,c=n-1;
        while(r<m && c>=0){
            if(mat[r][c]==x)
                return true;
            else if(mat[r][c]>x)
                c--;
            else
                r++;
        }
        return false;
    }
}
