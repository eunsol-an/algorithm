class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        boolean[] isDeleted = new boolean[my_string.length()];
        for (int index : indices) {
            isDeleted[index] = true;
        }
        for (int i = 0; i < my_string.length(); i++) {
            if (isDeleted[i]) {
                continue;
            }
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}