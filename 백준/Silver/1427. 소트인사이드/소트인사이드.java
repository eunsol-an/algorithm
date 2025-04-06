import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = str.charAt(i) - '0';
        }

        for (int i = 0; i < A.length; i++) {
            int max = 0;
            int maxIndex = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] >= max) {
                    max = A[j];
                    maxIndex = j;
                }
            }

            int temp = A[i];
            A[i] = max;
            A[maxIndex] = temp;
        }

        for (int j : A) {
            System.out.print(j);
        }
    }
}
