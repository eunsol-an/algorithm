import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        while (true) {
            int cur = Integer.parseInt(br.readLine());
            if (cur == -1) break;
            sum += cur;
        }
        System.out.println(sum);
    }
}