class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String s : dic) {
            int total = 0;
            for (String value : spell) {
                int cnt = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (value.charAt(0) == s.charAt(k)) {
                        cnt++;
                    }
                }
                if (cnt == 1) total++;
            }
            if (total == spell.length) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}