class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (String str : myString.split("")) {
            sb.append(str.toUpperCase());
        }
        return sb.toString();
    }
}