class Solution {
    public int solution(String s) {
        String[] numberToString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberToString.length; i++) {
            if (s.contains(numberToString[i])) {
                s = s.replaceAll(numberToString[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }
}