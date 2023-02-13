import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
		ArrayList<Integer> rank = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			rank.add(score[i]);
			if (i >= k) rank.remove(Collections.min(rank));
			result[i] = Collections.min(rank);
		}
		return result;
    }
}