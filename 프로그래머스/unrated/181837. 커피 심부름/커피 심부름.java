class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String elem : order) {
            if (elem.contains("americano")) answer += 4500;
            else if (elem.contains("cafelatte")) answer += 5000;
            else if (elem.contains("anything")) answer += 4500;
        }
        return answer;
    }
}