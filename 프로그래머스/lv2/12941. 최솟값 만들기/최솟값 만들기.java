import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] C = new Integer[B.length];
        Arrays.sort(A);
        for (int i = 0; i < B.length; i++) {
            C[i] = Integer.valueOf(B[i]);
        }
        Arrays.sort(C, Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * C[i];
        }
        return answer;
    }
}