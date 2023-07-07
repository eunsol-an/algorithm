import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_prefix) {
        List<String> strList = new ArrayList<>();
        for(int i = 1; i < my_string.length() + 1; i++) {
            String str = my_string.substring(0, my_string.length() - i);
            strList.add(str);
        }
        return strList.contains(is_prefix) ? 1 : 0;
    }
}