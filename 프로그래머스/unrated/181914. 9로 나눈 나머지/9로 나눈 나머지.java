class Solution {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        int result = answer % 9;
        return result;
    }
}