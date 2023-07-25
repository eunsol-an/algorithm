class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int index = 0;
        for (int i = start; i > end - 1; i--) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}