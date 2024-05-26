import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[]arrays = new int[10001];

        for (int i = 0; i < N; i++) {
            arrays[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for (int i = 0; i < 10001; i++) {
            while (arrays[i] > 0) {
                bw.write(i + "\n");
                arrays[i]--;
            }
        }

        bw.flush();
        bw.close();

    }
}