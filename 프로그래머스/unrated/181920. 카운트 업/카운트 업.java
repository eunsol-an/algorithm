class Solution {
    public int[] solution(int start, int end) {
        int idx = 0;
        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}