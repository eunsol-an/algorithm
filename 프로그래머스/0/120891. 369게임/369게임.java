class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = Integer.toString(order);
        for (String str : orderStr.split("")) {
            if (str.equals("3") || str.equals("6") || str.equals("9")) answer++;
        }
        return answer;
    }
}