class Solution {
    public int solution(int intNum) {
        long num = intNum;
        int answer = 0;
        if (num == 1) {
            return 0;
        }
        while (num != 1) {
            if (answer >= 500) {
                return -1;
            } else if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else if (num % 2 != 0) {
                num = num * 3 + 1;
                answer++;
            }
        }
        return answer;
    }
}