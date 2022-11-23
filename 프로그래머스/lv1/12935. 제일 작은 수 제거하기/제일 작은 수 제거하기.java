import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }
        Integer min = Collections.min(intList);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == min)  {
                intList.remove(i);
            }
        }
        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i).intValue();
        }
        return answer;
    }
}