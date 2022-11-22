import java.util.Arrays;
class Solution {
    // string을 char형 배열로 변환
    // 먼저 Arrays.sort()를 이용해 정렬하고
    // StringBuilder로 받아 reverse 해즘
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        StringBuilder str = new StringBuilder(new String(charArr));
        String reversStr = str.reverse().toString();
        return reversStr;
    }
}