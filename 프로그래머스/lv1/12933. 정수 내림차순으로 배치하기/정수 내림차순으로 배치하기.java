import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String answer = "";

        String str = Long.toString(n);
        String[] strArr = str.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        for (int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }

        return Long.parseLong(answer);
    }
}