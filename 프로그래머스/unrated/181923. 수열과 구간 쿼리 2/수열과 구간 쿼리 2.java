import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            List<Integer> numList = new ArrayList<>();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    numList.add(arr[j]);
                }
            }
            Collections.sort(numList);
            if (numList.size() == 0) {
                answer[i] = -1;
                continue;
            }
            answer[i] = numList.get(0);
        }
        return answer;
    }
}