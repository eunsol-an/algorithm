class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;
        for (int i = 0; i < included.length; i++) {
            answer += (included[i] ? num : 0);
            num += d;
        }
        return answer;
    }
}