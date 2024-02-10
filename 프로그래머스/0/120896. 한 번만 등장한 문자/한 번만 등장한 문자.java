import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
                
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                sb.append(key);
            }
        }
        
        String result = sb.toString();
        char[] answer = result.toCharArray();
        Arrays.sort(answer);
        return String.valueOf(answer);
    }
}