class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (sum * 1.0) / arr.length;
    }
}