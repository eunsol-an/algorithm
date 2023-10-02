class Solution {
    public int solution(String my_string) {
        char[] chars = my_string.toCharArray();
        String str = "";
        
        for (int i = 0; i < chars.length; i++) {
            if(49 <= chars[i] && chars[i] <= 57) {
                str += chars[i];
            }
        }
        
        int answer = 0;
        String[] strArr = str.split("");
        for (int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}