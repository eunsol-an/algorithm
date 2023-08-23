import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> numList = new ArrayList<>();
        for (int i : emergency) {
            numList.add(i);
        }
        Integer[] reverse = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(reverse, Collections.reverseOrder());
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (reverse[i] == numList.get(j)) {
                    answer[j] = i + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}