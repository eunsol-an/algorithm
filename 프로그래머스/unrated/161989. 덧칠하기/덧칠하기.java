class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;
        for (int one : section) {
            if (one < max) continue;
            answer += 1;
            max = one + m;
        }
        return answer;
    }
}