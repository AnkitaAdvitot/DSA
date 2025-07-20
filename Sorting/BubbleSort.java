import java.util.Arrays;

class BubbleSort{
    static void sort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
                System.out.println(Arrays.toString(arr));
            }
            if(!flag)
                break;
        }
    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        sort(arr);
    }
}