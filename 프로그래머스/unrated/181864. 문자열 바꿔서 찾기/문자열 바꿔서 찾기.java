class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (String str : myString.split("")) {
            sb.append((str.equals("A")) ? "B" : "A");
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}