import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < delete_list.length; i++) {
            delList.add(delete_list[i]);
        }
        
        List<Integer> answerList = new ArrayList<>();
        for (int num : arr) {
            if (!delList.contains(num)) answerList.add(num);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
    
        return answer;
    }
}