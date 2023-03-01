import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> goalList = new ArrayList<>(Arrays.asList(goal));
        List<String> cards1List = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2List = new ArrayList<>(Arrays.asList(cards2));

        for (String s : goalList) {
            if (!cards1List.isEmpty() && cards1List.get(0).equals(s)) {
                cards1List.remove(0);
            } else if (!cards2List.isEmpty() && cards2List.get(0).equals(s)) {
                    cards2List.remove(0);
            } else {
                    return "No";
            }
        }
        return "Yes";
    }
}