import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] longArray = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            longArray[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(longArray);

        int result = 0;
        for (int i = 0; i < N; i++) {
            long target = longArray[i];
            int startIndex = 0;
            int endIndex = N - 1;

            while (startIndex < endIndex) {
                long sum = longArray[startIndex] + longArray[endIndex];
                if (sum == target) {
                    if (startIndex != i && endIndex != i) {
                        result++;
                        break;
                    } else if (startIndex == i) {
                        startIndex++;
                    } else {
                        endIndex--;
                    }
                } else if (sum > target) {
                    endIndex--;
                } else {
                    startIndex++;
                }
            }
        }

        System.out.println(result);
        br.close();
    }
}
