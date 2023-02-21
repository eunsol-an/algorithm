class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] originalBadList = {"aya", "ye", "woo", "ma"};
        String[] repeatBadList = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String bab : babbling) {
            for (String rBab : repeatBadList) {
                bab = bab.replace(rBab, "x");
            }
            for (String oBab : originalBadList) {
                bab = bab.replace(oBab, "?");
            }

            int sign = 0;
            for (int i = 0; i < bab.length(); i++) {
                if (!bab.subSequence(i, i + 1).equals("?")) {
                    sign = 1;
                    break;
                }
            }

            if (sign == 0) {
                answer++;
            }
        }
        return answer;
    }
}