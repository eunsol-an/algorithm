import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        PriorityQueue<Integer> rank = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (i >= k) rank.poll();
            result[i] = rank.peek();
        }
        return result;
    }
}