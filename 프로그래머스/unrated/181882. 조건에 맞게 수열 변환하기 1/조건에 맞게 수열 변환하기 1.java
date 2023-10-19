class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (arr[i] >= 50 && arr[i] % 2 == 0) num = arr[i] / 2;
            if (arr[i] < 50 && arr[i] % 2 != 0) num = arr[i] * 2;
            answer[i] = num;
        }
        return answer;
    }
}