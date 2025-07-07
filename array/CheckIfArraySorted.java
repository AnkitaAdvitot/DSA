import java.util.Scanner;

class CheckIfArraySorted{
    static boolean checkSort(int[] arr){
        if(arr[0]>arr[arr.length-1]){
            for(int i=1;i<arr.length;i++){
              if(arr[i]>arr[i-1])
                return false;        
         }
        }
        else{
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;        
         }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Is sorted  "+checkSort(arr));
    }
}