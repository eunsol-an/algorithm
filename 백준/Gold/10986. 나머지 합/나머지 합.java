import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N];
        long[] sameRemainder = new long[M];
        long answer = 0;

        // 합배열
        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 나머지가 같은 수 카운팅
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder == 0) answer++;
            sameRemainder[remainder]++;
        }

        // 경우의 수 구하기
        // C[i]개 중 2개를 뽑는 경우의 수 계산 공식 C[i] * (C[i] - 1) / 2
        for (int i = 0; i < M; i++) {
            if (sameRemainder[i] > 1) {
                answer += sameRemainder[i] * (sameRemainder[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}
