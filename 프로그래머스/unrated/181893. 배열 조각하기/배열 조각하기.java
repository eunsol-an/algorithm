import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            arr = (i % 2 == 0) ? Arrays.copyOfRange(arr, 0, query[i]+1) 
                : Arrays.copyOfRange(arr, query[i], arr.length);
        }
        return arr;
    }
}