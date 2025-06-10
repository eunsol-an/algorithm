import java.io.*;

public class Main {
    public static int[] A, tmp;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(1, N);

        for (int i = 1; i <= N; i++) {
            bw.write(A[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) return;

        int m = start + (end - start) / 2;

        mergeSort(start, m);

        mergeSort(m + 1, end);

        for (int i = start; i <= end; i++) {
            tmp[i] = A[i];
        }

        int index = start;
        int pointer1 = start;
        int pointer2 = m + 1;

        while (pointer1 <= m && pointer2 <= end) {
            if (tmp[pointer1] < tmp[pointer2])  {
                A[index] = tmp[pointer1];
                index++;
                pointer1++;
            } else {
                A[index] = tmp[pointer2];
                index++;
                pointer2++;
            }
        }

        while (pointer1 <= m) {
            A[index] = tmp[pointer1];
            index++;
            pointer1++;
        }

        while (pointer2 <= end) {
            A[index] = tmp[pointer2];
            index++;
            pointer2++;
        }


    }
}
