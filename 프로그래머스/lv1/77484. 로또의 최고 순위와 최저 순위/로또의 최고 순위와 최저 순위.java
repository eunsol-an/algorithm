class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] score = {6, 6, 5, 4, 3, 2, 1};

        int same_nums = 0;
        int zero_count = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    same_nums++;
                }
            }
            if (lottos[i] == 0) {
                zero_count++;
            }
        }
        int[] answer = new int[] {score[same_nums + zero_count], score[same_nums]};
        return answer;
    }
}