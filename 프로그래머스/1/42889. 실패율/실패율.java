import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] failMember = new int[N + 2];
        
        for (int stage : stages) {
            failMember[stage]++;
        }
        
        int[] sucessMember = new int[N + 1];
        sucessMember[N] = failMember[N] + failMember[N + 1];
        for (int i = N - 1; i >= 1; i--) {
            sucessMember[i] = sucessMember[i + 1] + failMember[i];
        }
        
        HashMap<Integer, Double> stageFail = new HashMap();
        for (int i = 1; i <= N; i++) {
            if (sucessMember[i] == 0 || failMember[i] == 0) {
                stageFail.put(i, 0.0);
            } else {
                stageFail.put(i, (double) failMember[i]/sucessMember[i]);
            }
        }
        
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(stageFail.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        for (int i = 0; i < N; i++) {
            answer[i] = entryList.get(i).getKey();
        }
    
        return answer;
    }
}