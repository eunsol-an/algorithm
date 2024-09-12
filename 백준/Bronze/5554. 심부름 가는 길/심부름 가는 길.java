import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 3; i++) {
            total += Integer.parseInt(br.readLine());
        }
        System.out.print(total / 60 + "\n" + total % 60);
    }
}