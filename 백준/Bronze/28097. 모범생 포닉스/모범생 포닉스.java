import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int sumTime = (n - 1) * 8;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			sumTime += Integer.parseInt(st.nextToken());
		}
		
		sb.append(sumTime / 24).append(" ").append(sumTime % 24);
		
		bw.write(sb.toString());
        
		bw.flush();
		bw.close();
		br.close();
	}
}