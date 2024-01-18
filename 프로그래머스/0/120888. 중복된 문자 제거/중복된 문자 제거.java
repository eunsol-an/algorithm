class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String str : my_string.split("")) {
            if (!answer.contains(str)) answer += str;
        }
        return answer;
    }
}