package conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion1031 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.printf("%o", num);
	}
}
