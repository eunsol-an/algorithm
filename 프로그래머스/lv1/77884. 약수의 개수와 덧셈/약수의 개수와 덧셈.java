class Solution {
    // 자연수 n을 매개 변수로 받고 약수의 개수 count를 리턴하는 메소드 생성
    // 반복문으로 left부터 right까지 돌면서 약수 개수의 짝/홀수를 판별
    // 모든 값을 int형 정답 변수에 담되, 약수 개수가 홀수라면 * (-1)

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (divisorCount(i) % 2 == 0) {
                answer += i;
            } else {
                answer += (i * (-1));
            }
        }
        return answer;
    }
    
    public int divisorCount(int n) {
        int count = 1; // 1 포함
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }
}