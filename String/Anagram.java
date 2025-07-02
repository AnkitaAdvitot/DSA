import java.util.HashMap;

class Anagram{
     public static boolean isAnagram(String s1, String s2) {
        // If lengths differ, they can't be anagrams
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in first string
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequency using second string
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c); // optional: clean up
            }
        }

        // If map is empty, strings are anagrams
        return map.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("hello", "world"));     // false
    }
}