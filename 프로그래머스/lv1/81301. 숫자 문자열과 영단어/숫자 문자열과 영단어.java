class Solution {
    public int solution(String s) {
        String[] numberToString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] StringToNumber = {"0", "1","2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < numberToString.length; i++) {
            if (s.contains(numberToString[i])) {
                s = s.replaceAll(numberToString[i], StringToNumber[i]);
            }
        }
        return Integer.parseInt(s);
    }
}