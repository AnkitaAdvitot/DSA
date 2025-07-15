import java.util.Scanner;
class FindSqrtWithDecimal{
   static  public int mySqrt(int x) {
        int low=0,high=x;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sq=(long)mid*mid;
            if(sq==x)
                return mid;
            else if(sq>x)
                high=mid-1;
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    static double findDecimal(int n,int precision,int tempSol){
        double ans=tempSol;
        double factor=1;
        for(int i=0;i<precision;i++){
            factor=factor/10;
            for(double j=ans;j*j<n;j=j+factor){
                ans=j;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tempSol=mySqrt(n);
        System.out.println("Sqrt "+findDecimal(n, 3, tempSol));
    }
}