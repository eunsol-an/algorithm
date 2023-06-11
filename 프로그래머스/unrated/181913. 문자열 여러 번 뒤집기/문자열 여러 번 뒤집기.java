class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            String temp = "";
            for (int j = queries[i][1]; j >= queries[i][0]; j--) {
                temp += chars[j];
            }
            int cnt = 0;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                chars[j] = temp.charAt(cnt);
                cnt++;
            }
        }
        return String.valueOf(chars);
    }
}