class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for (int i = 0; i < finished.length; i++) {
            length = finished[i] ? length : length + 1;
        }
        String[] answer = new String[length];
        
        int index = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}