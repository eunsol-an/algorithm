package conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion1035 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine(), 16);
		System.out.printf("%o", num);
	}
}
