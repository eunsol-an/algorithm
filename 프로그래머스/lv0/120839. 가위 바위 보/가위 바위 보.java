class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            int num = Character.getNumericValue(rsp.charAt(i));
            if (num == 2) answer.append(0);
            if (num == 0) answer.append(5);
            if (num == 5) answer.append(2);
        }
        return answer.toString();
    }
}