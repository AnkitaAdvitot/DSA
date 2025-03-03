
import java.util.Scanner;

public class ArrayInput {
    static Scanner sc=new Scanner(System.in); 
    static void leftShiftByOne(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println("Left Shift by one ");

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void rightShiftByOne(int[] arr){
        
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("Right Shift ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void leftShiftByK(int[] arr,int k){

        for(int i=0;i<k;i++){
            int temp=arr[0];
           
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println("Left shift by k elements");

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

    }
    static void rightShiftByK(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }

        System.out.println("Right shift by k elements");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
  
       
        System.out.println("1.Left Shift by one\n2.Right Shift by one\n3.Left shift by k\n4.Right Shift by k");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements in space separated");
        String s=sc.nextLine();

        String s1[]=s.split(" ");
        int[] arr=new int[s1.length];
        for(int j=0;j<arr.length;j++){
            arr[j]=Integer.parseInt(s1[j]);
        }
        switch(ch) {

            case 1:
                leftShiftByOne(arr);
                break;
            case 2:
                rightShiftByOne(arr);
                break;
            case 3:
                System.out.println("Enter k");
                int k=sc.nextInt();
                leftShiftByK(arr, k);
                break;
            case 4:
                System.out.println("Enter k");
                 k=sc.nextInt();
                rightShiftByK(arr, k);
                break;
            default:
                System.out.println("Invalid choice!");
        }
      
    }
   
}

