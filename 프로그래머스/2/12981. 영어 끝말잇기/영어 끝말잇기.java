import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> checkList = new ArrayList<>();
        int[] answer = {0, 0};
        checkList.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            if (checkList.contains(words[i]) || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            checkList.add(words[i]);
        }

        return answer;
    }
}