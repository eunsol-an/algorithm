import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            strList.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(strList);
        for (int i = 0; i < strList.size(); i++) {
            answer[i] = strList.get(i).substring(1);
        }
        return answer;
    }
}