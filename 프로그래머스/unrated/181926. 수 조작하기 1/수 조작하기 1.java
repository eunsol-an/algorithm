class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') answer += 1;
            if (control.charAt(i) == 's') answer -= 1;
            if (control.charAt(i) == 'd') answer += 10;
            if (control.charAt(i) == 'a') answer -= 10;
        }
        return answer;
    }
}