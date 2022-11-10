package arithmeticOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArithmeticOperation1045 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		System.out.printf("%d\n", a + b);
		System.out.printf("%d\n", a - b);
		System.out.printf("%d\n", a * b);
		System.out.printf("%d\n", a / b);
		System.out.printf("%d\n", a % b);
		System.out.printf("%.2f", (float)a / b);
	}
}
