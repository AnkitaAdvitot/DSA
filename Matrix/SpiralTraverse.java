import java.util.ArrayList;
public class SpiralTraverse {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> ans=new ArrayList<>();
        int m=mat.length;
        int n=mat[0].length;
        int top=0,b=m-1,left=0,right=n-1;
        while(top<=b && left<=right){
            for(int i=left;i<=right;i++)
                ans.add(mat[top][i]);
            top++;
            for(int i=top;i<=b;i++)
                ans.add(mat[i][right]);
            right--;
            if(top<=b){
                for(int i=right;i>=left;i--)
                ans.add(mat[b][i]);
                b--;    
            }
            if(left<=right){
                for(int i=b;i>=top;i--)
                ans.add(mat[i][left]);
                left++;    
            }
            
        }
        return ans;
    }
}
