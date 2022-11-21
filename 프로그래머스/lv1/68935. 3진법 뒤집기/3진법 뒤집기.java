import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> temp = new ArrayList<>();
        while (n != 0) {
            temp.add(n % 3);
            n /= 3;
        }
        for (int i = 0; i < temp.size(); i++) {
            answer += (Math.pow(3, temp.size()-i-1)*temp.get(i));
        }
        return answer;
    }
}