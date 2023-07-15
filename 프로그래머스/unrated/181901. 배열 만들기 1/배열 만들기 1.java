import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public List<Integer> solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i <= n; i += k) {
            if (i == 0) continue;
            answer.add(i);
        }
        return answer;
    }
}