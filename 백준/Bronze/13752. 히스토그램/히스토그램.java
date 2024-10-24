import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            String unitBar = "=";
            String histogramBar = unitBar.repeat(K);
            
            System.out.println(histogramBar);
        }
    }
}