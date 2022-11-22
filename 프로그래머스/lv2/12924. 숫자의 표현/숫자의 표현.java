class Solution {
    public int solution(int n) {
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int count = 1;

        while (endIndex != n) {
            if (sum == n) {
                endIndex++;
                sum += endIndex;
                count++;
            } else if (sum > n) {
                sum -= startIndex;
                startIndex++;
            } else {
                endIndex++;
                sum += endIndex;

            }
        }
        return count;
    }
}