import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        // score 배열의 길이 부터 m 까지 m 만큼 반복
        // i 에서 m 을 뺀 만큼의 index 로 접근
        // answer 에 p * m 더하기
        int answer = 0;
        Arrays.sort(score); // {1, 1, 1, 2, 2, 3, 3}
        for (int i = score.length; i >= m; i-= m) {
            answer += score[i - m] * m;
        }
        return answer;
    }
}