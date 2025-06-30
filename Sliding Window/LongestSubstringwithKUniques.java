import java.util.HashMap;

class LongestSubstringwithKUniques{
     public int longestkSubstr(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        int size=s.length();
        int max=-1;
        while(j<size){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
            if(map.size()<k)
                j++;
            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
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
}