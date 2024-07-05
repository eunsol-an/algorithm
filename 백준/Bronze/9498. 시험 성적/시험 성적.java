import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		int A = Integer.parseInt(br.readLine());
        
		System.out.print((A >= 90) ? "A" : (A >= 80) ? "B" : (A >= 70) ? "C" : (A >= 60) ? "D" : "F");
 
	}
}