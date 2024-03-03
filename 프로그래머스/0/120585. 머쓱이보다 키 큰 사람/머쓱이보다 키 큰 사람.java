import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for (int num : array) {
            if (height < num) answer++;
        }
        return answer;
    }
}