import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int firstTeam = arr[0] + arr[3];
        int secondTeam = arr[1] + arr[2];
        
        int result = Math.abs(firstTeam - secondTeam);
        
        System.out.println(result);
    }
}