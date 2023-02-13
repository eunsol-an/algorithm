import java.util.Arrays;
class Solution {
    // 배열 오름차순 정렬
    // score 배열의 길이에서 i 를 뺀 값이 m 의 배수이면 그 인덱스 요소 => 최솟값 p
    // answer 에 p * m 더하기
    
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // {1, 1, 1, 2, 2, 3, 3}
        for (int i = score.length - 1; i >= 0; i--) {
            if ((score.length - i) % m == 0) answer += score[i] * m;
        }
        return answer;
    }
}