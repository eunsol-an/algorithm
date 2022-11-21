import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(long n) {
        List<Long> longList = new ArrayList<>();
        while(n > 0) {
            longList.add(n % 10);
            n = n /10;
        }
        int[] answer = new int[longList.size()];
        for (int i = 0; i < longList.size(); i++) {
            answer[i] = longList.get(i).intValue();
        }
        return answer;
    }
}