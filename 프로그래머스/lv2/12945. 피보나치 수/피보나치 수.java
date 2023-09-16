import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i - 1) % 1234567 + list.get(i - 2) % 1234567);
        }
        return list.get(list.size() - 1) % 1234567;
    }
}