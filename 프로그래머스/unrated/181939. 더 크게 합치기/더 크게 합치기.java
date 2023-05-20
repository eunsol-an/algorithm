class Solution {
    public int solution(int a, int b) {
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);
        int answer = Integer.parseInt(stringA + stringB);
        int reverseAnswer = Integer.parseInt(stringB + stringA);
        if(answer > reverseAnswer) {
            return answer;
        } 
        return reverseAnswer;
    }
}