class Solution {
    public int solution(String s) {
        int answer = 0;
        while (s.length() != 0) {
            answer++;

            char ch = s.charAt(0);
            int sCount = 1;
            int dCount = 0;
            for (int i = 1; i < s.length(); i++) {
                if (ch == s.charAt(i))
                    sCount++;
                else
                    dCount++;

                if (sCount == dCount)
                    break;
            }

            s = s.substring(sCount + dCount);
        }
        return answer;
    }
}