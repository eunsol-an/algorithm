import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = br.readLine();
			
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;
            
			if (A == 0 && B == 0) {
				break;
			}
			sb.append((A + B)).append('\n');
		}
		System.out.println(sb);
	}
}