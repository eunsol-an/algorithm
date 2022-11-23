class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((i != j) && (j != k) && (i != k)) {
                        if (isPrime(nums[i] + nums[j] + nums[k])) {
                            answer++;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int n) {
        int count = 0;
        for (int j = 2; j <= (int)Math.sqrt(n); j++) {
            if (n % j == 0) {
                count++;
            }
        }
        return count == 0;
    }
}