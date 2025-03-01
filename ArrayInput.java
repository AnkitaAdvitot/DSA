
import java.util.Scanner;

public class ArrayInput {
    static Scanner sc=new Scanner(System.in); 
    static void input(){
        System.out.println("Enter elements in space separated ");
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int[] arr=new int[s1.length];
        for(int j=0;j<arr.length;j++){
            arr[j]=Integer.parseInt(s1[j]);
        }
        System.out.println("Array Elements ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void leftShiftByOne(){
        System.out.println("Enter elements in space separated ");
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        int[] arr=new int[s1.length];
        for(int j=0;j<arr.length;j++){
            arr[j]=Integer.parseInt(s1[j]);
        }
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println("Left Shift ");

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void rightShiftByOne(){
        System.out.println("Enter elements in space separated ");

        String s=sc.nextLine();
        String[] s1=s.split(" ");
        int[] arr=new int[s1.length];
        for(int j=0;j<arr.length;j++){
            arr[j]=Integer.parseInt(s1[j]);
        }
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
            int temp=arr[i];
            for(int j=i+1;j<arr.length;i++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-i]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
    //     input();
    //    leftShiftByOne();
    //    rightShiftByOne();
    System.out.println("input");
       String s=sc.nextLine();
       String[] s1=s.split(" ");
       int[] arr=new int[s1.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        System.out.println("Left shift by k elements");
         leftShiftByK(arr,3);
    }
   
}
