import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> strList = new ArrayList<>();
        for(int i = 1; i < my_string.length() + 1; i++) {
            String str = my_string.substring(my_string.length() - i, my_string.length());
            strList.add(str);
            System.out.println(str);
        }
        return strList.contains(is_suffix) ? 1 : 0;
    }
}