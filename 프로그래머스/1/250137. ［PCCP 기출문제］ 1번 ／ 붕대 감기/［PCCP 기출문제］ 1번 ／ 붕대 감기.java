class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cnt = bandage[0];
        int now = health;
        int std = 0;

        int v1, v2;
        for (int[] atk: attacks) {
            if (now <= 0) {
                return -1;
            }

            v1 = atk[0] - std - 1;
            v2 = v1 / cnt;

            std = atk[0];
            now = Math.min(health, now + (v1 * bandage[1]));
            now = Math.min(health, now + (v2 * bandage[2]));

            now -= atk[1];
        }        

        return now <= 0 ? -1 : now;
    }
}