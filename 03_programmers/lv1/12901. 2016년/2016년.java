class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] monthOfDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;
        for (int i = 0; i < (a - 1); i++) {
            days += monthOfDay[i];
        }
        int weekIndex = (days + b) % 7;
        answer = week[weekIndex];
        return answer;
    }
}