import java.util.Scanner;

class Traversal{
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
     static void colTraversal(int[][] mat){
        System.out.println("Column wise Traversal ");
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++)
                System.out.print(mat[j][i]+" "); 
            System.out.println();
        }
    }
    static void diagonal(int[][] mat){
        System.out.println("Diagonal  Traversal ");
        int row=mat.length;
        int col=mat[0].length;
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                if(i==j)
                    System.out.print(mat[i][j]+" ");
                else if(row-i-1==j) 
                    System.out.print(mat[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void boundary(int[][] mat){
        System.out.println("Boundary  Traversal ");
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0|| j==0 || i==row-1 || j==col-1)
                    System.out.print(mat[i][j]+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args){
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
        colTraversal(mat);
        diagonal(mat);
        boundary(mat);
     }

}