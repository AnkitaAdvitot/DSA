
import java.util.ArrayList;

public class Subsets {
    
    static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
   public static void findSubsets(int n,ArrayList<Integer> subset){

        if(n==0){
            print(subset);
            return ;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n=4;
        ArrayList<Integer> subSet=new ArrayList<>();
        findSubsets(n,subSet);
        System.out.println(subSet);
    }
}
