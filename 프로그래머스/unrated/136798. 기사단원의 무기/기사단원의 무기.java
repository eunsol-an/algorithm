class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int divisor = divisor(i);
            if (divisor > limit) {
                answer += power;
            } else {
                answer += divisor;
            }
        }
        return answer;
    }

    public int divisor(int num) {
        if (num == 1) return 1;
        int result = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (Math.pow(i, 2) == num) result++;
                else result += 2;
            }
        }
        return result;
    }
}