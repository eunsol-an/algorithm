class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        while (n > 0) {
            answer.insert(0, ((n % 3 == 0) ? "4" : Integer.toString(n % 3)));
            n = n / 3 + ((n % 3 == 0) ? -1 : 0);
        }
        return answer.toString();
    }
}