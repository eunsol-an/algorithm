class Solution {
    public int[] solution(int n) {
        int cnt = (n % 2 == 0) ? (n / 2) : (n / 2) + 1;
        int idx = 0;
        int[] answer = new int[cnt];
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}