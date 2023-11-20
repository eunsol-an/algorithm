import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesHash = new HashMap<>();
        
        for (String[] clothe : clothes) {
            if (clothesHash.containsKey(clothe[1])) {
                int num = clothesHash.get(clothe[1]);
                clothesHash.put(clothe[1], num + 1);
            } else {
                clothesHash.put(clothe[1], 2);
            }
        }
        
        for (String str : clothesHash.keySet()) {
            answer *= clothesHash.get(str);
        }
        
        answer -= 1;
        
        return answer;
    }
}