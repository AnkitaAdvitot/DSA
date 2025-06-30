
import java.util.HashMap;
public class PickToys{
    static int maximumNoOfToys(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int i=0,j=0;
        int size=s.length();
        while(j<size){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c, 0)+1);
            if(map.size()<=2){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>2){
                while(map.size()>2){
                    char ch=s.charAt(i);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0)
                        map.remove(ch);
                    i++;
                }
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="abbacca";
        System.out.println("Maximum Number of Toys "+maximumNoOfToys(s));
    }
}
