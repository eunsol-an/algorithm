class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^\\d]", " ");
        String[] str = my_string.split(" ");
        for (int i = 0; i < str.length; i++) {
            answer += (!str[i].isEmpty()) ? Integer.parseInt(str[i]) : 0;
        }
        
        return answer;
    }
}