import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> pList = new ArrayList<>();
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            pList.add(t.substring(i, i + p.length()));
        }
        for (String s : pList) {
            if (Long.parseLong(s) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}