
import java.util.Scanner;

class FrequencyWithoutHashMap{
    static int[] arr=new int[26];
    static void freq(String s){
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        System.out.println("Frequency of "+s);
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                System.out.println((char)( i+'a')+" - "+arr[i]);
            }
        } 
    }
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String s=sc.next();
        freq(s);
      
   }
}