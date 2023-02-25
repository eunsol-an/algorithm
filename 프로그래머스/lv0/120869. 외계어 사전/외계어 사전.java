class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++) { // def
            int total = 0;
            for (int j = 0; j < spell.length; j++) { // z d
                int cnt = 0;
                for (int k = 0; k < dic[i].length(); k++) { // d e f
                    if (spell[j].charAt(0) == dic[i].charAt(k)) {
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