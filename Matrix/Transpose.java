import java.util.Scanner;

public class Transpose {
    public static int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] res=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    } 
    static void transposeInPlace(int[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                if(i==j)
                    continue;
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
     static void rowTraversal(int[][] mat){
        System.out.println("Row wise Traversal ");
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(mat[i][j]+" "); 
            System.out.println();
        }
    }
      public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter row size");
            int n=sc.nextInt();
            System.out.println("Enter cols size");
            int m=sc.nextInt();
            System.out.println("Enter elements: ");
            int[][] mat=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
              rowTraversal(mat);
          transposeInPlace(mat);
         rowTraversal(mat);
        }
        
     }
}
