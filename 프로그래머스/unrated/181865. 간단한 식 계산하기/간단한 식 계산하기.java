class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        Integer a = Integer.parseInt(strArr[0]);
        Integer b = Integer.parseInt(strArr[2]);
        switch(strArr[1]) {
            case "+": answer = a + b;
                break;
            case "-": answer = a - b;
                break;
            case "*": answer = a * b;
                break;
        }
        return answer;
    }
}