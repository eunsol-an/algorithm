class Solution {
    public int solution(int a, int b) {
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);
        int ab = Integer.parseInt(stringA + stringB);
        int ab2 = 2 * a * b;
        return ab > ab2 ? ab : ab2;
    }
}