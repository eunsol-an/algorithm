package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Condition1066 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if (b % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if (c % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
