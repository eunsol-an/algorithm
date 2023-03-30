class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int roller = section[0];
        for (int point : section) {
            if (point >= roller) {
                answer += 1;
                roller = point + m;
            }
        }
        return answer;
    }
}