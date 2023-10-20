class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (String str : my_string.split("")) {
            if (str.equals(alp)) {
                answer += str.toUpperCase();
            } else {
                answer += str;
            }
        }
        return answer;
    }
}