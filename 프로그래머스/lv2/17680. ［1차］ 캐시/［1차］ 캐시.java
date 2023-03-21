import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        int answer = 0;
        Queue<String> cacheString = new LinkedList<>();
        for (String city : cities) {
            String cityLowerCase = city.toLowerCase();
            if (!cacheString.contains(cityLowerCase)) {
                if (cacheString.size() == cacheSize) cacheString.poll();
                cacheString.add(cityLowerCase);
                answer += 5;
            } else {
                cacheString.remove(cityLowerCase);
                cacheString.add(cityLowerCase);
                answer += 1;
            }
        }
        return answer;
    }
}