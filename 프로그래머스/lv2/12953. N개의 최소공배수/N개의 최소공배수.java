class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        // 원소가 1개일 경우, 바로 반환
        if (arr.length == 1) return arr[0];

        // 원소가 2개일 경우
        answer = lcm(arr[0], arr[1]);

        // 원소가 3개 이상일 경우
        if (arr.length > 2) {
            for (int i = 2; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
            }
        }

        return answer;
    }

    // 최대 공약수
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 최소 공배수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}