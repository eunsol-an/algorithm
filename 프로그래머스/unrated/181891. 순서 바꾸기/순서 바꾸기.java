class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[index] = num_list[i];
            index++;
        }
        for (int i = 0; i < n; i++) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}