class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] strArr = s.split("");
        for (int i = 0; i < strArr.length; i++) {
            cnt = (strArr[i].equals(" ") ? 0 : cnt + 1 );
            answer += (cnt % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase());
        }
        return answer;
    }
}