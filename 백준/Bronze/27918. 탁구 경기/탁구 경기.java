import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int X = 0;
		int Y = 0;
		
		int sign = 0;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			if (str.equals("D")) X++;
			else Y++;
			
			if (sign == 0) {
				if (Math.abs(X - Y) == 2) {
					System.out.print(X + ":" + Y);
					System.out.println();
					sign = 1;
				}
			}
		}
		
		if (sign == 0) {
			System.out.print(X + ":" + Y);
			System.out.println();
		}
	}

}