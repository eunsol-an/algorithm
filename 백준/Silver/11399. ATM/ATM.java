import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] S = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            int insertIndex = i;
            int insertValue = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] < A[i]) {
                    insertIndex = j + 1;
                    break;
                }
                if (j == 0) {
                    insertIndex = 0;
                }
            }
            for (int j = i; j > insertIndex; j--) {
                A[j] = A[j - 1];
            }
            A[insertIndex] = insertValue;
        }

        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += S[i];
        }

        System.out.println(result);

    }
}
