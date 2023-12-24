import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 1; j <= arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}