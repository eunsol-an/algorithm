class Solution {
    public int solution(int n, int k) {
        int answer = (n * 12000) + (k * 2000);
        if (n / 10 >= 1) {
            int service = n / 10;
            answer = answer - (service * 2000);
        }
        return answer;
    }
}