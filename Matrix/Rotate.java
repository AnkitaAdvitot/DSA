import java.util.Scanner;

public class Rotate {
 
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
    static void reverse(int[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        for (int i = 0; i < row; i++) {
            int s=0,e=col-1;
            while(s<e){
                int temp=mat[i][e];
                mat[i][e]=mat[i][s];
                mat[i][s]=temp;
                s++;
                e--;

            }
        }
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
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
          reverse(mat);
         rowTraversal(mat);
         
    }
}
