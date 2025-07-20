
import java.util.Arrays;

class  SelectionSort{

    static void swap( int a,int b){


    }
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                    flag=true;
                }
            }   
            // swap(arr[i],arr[min]);
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            if(!flag)
                return;
            System.out.println(Arrays.toString(arr));
        }
    }
     public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        sort(arr);

    }
}