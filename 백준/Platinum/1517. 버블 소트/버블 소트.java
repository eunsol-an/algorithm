import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] A, tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        result = 0;
        mergeSort(1, N);

        System.out.println(result);
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) return;

        int mid = start + (end - start) / 2;

        mergeSort(start, mid);
        mergeSort(mid + 1, end);

        for (int i = start; i <= end; i++) {
            tmp[i] = A[i];
        }

        int index = start;
        int pointer1 = start;
        int pointer2 = mid + 1;

        while (pointer1 <= mid && pointer2 <= end) {
            if (tmp[pointer1] > tmp[pointer2]) {
                A[index] = tmp[pointer2];

                result += (mid - pointer1 + 1);
                
                pointer2++;
            } else {
                A[index] = tmp[pointer1];
                pointer1++;
            }
            index++;
        }

        while (pointer1 <= mid) {
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
