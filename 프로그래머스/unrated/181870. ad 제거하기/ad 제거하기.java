import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) strList.add(str);
        }
        return strList.toArray(new String[strList.size()]);
    }
}