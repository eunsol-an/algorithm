class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0, s))
            .append(sb.toString())
            .append(my_string.substring(e + 1));
        return answer.toString();
    }
}