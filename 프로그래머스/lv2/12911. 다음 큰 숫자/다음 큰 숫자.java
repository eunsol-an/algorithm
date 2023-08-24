class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCount = 0;
        char[] binary = (Integer.toBinaryString(n)).toCharArray();
        for(char c : binary) {
            if (1 == Character.getNumericValue(c)) oneCount++;
        }
        for(int i = n + 1; i <= 1000000; i++) {
            int compareCount = 0;
            char[] compareBinary = (Integer.toBinaryString(i)).toCharArray();
            for(char c : compareBinary) {
                if (1 == Character.getNumericValue(c)) compareCount++;
            }
            if (oneCount == compareCount) {
                return i;
            }
        }
        return answer;
    }
}