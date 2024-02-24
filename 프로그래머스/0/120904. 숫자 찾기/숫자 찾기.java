class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        for (String str : (Integer.toString(num)).split("")) {
            answer += 1;
            if (str.equals(Integer.toString(k))) return answer;
        }
        return -1;
    }
}