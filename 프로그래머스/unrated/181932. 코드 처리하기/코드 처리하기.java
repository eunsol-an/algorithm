class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if (!mode) {
                if ((code.charAt(i) != '1') && (i % 2 == 0)) {
                    answer.append(code.charAt(i));
                }
            } else {
                if ((code.charAt(i) != '1') && (i % 2 != 0)) {
                    answer.append(code.charAt(i));
                }
            }
            if (code.charAt(i) == '1') mode = !mode;
        }
        if (answer.toString().equals("")) return "EMPTY";
        return answer.toString();
    }
}