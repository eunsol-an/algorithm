import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public int solution(int k, int[] tangerine) {
        if (k == 1) return 1;
        int answer = 0;
        int cnt = 0;
        List<Integer> countList = new ArrayList<>();

        Arrays.sort(tangerine);
        for (int i = 0; i < tangerine.length; i++) {
            cnt++;
            if ((i < tangerine.length - 1 && tangerine[i] != tangerine[i + 1])
                    || (i == tangerine.length - 1 && cnt > 0)) {
                countList.add(cnt);
                cnt = 0;
            }
        }
        
        countList.sort(Collections.reverseOrder());
        int i = 0;
        while (k > 0) {
            k -= countList.get(i);
            i++;
            answer++;
        }
        
        return answer;
    }
}