import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] answerArr = s.split("\\s");
        int[] intArr = new int[answerArr.length];
        for (int i = 0; i < answerArr.length; i++) {
            intArr[i] = Integer.parseInt(answerArr[i]);
        }
        Arrays.sort(intArr);
        return intArr[0] + " " + intArr[intArr.length - 1];
    }
}