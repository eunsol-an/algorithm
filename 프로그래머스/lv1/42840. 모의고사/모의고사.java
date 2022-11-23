import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int a_count = 0;
        int b_count = 0;
        int c_count = 0;

        // 각 수포자들이 찍은 정답 규칙
        int[] a_answer = {1, 2, 3, 4, 5};
        int[] b_answer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c_answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자들이 맞은 정답 개수
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a_answer[i%5]) a_count++;
            if (answers[i] == b_answer[i%8]) b_count++;
            if (answers[i] == c_answer[i%10]) c_count++;
        }
        
        // 최고점
        int max = Math.max(a_count, Math.max(b_count, c_count));

        if (max == a_count && max == b_count && max == c_count) return new int[] {1, 2, 3};
        else if (max == a_count && max == b_count) return new int[] {1, 2};
        else if (max == a_count && max == c_count) return new int[] {1, 3};
        else if (max == b_count && max == c_count) return new int[] {2, 3};
        else if (max == b_count) return new int[] {2};
        else if (max == c_count) return new int[] {3};
        else return new int[] {1};
    }
}