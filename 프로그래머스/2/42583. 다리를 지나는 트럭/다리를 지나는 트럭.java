import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int weightSum = 0;
        int answer = 0, index = 0;
        
        for (int i = 0; i < bridge_length; i++) queue.offer(0);
        
        while (index < truck_weights.length) {
            weightSum -= queue.poll();
            if (weightSum + truck_weights[index] <= weight) {
                 weightSum += truck_weights[index];
                 queue.offer(truck_weights[index++]);
            } else {
                queue.offer(0);
            }
            answer += 1;
        }
        
        while (!queue.isEmpty()) {
            answer += 1;
            queue.poll();
        }
        
        return answer;
    }
}