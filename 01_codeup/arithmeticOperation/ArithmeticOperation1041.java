package arithmeticOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperation1041 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char num = br.readLine().charAt(0);
		System.out.print((char)(num + 1));
	}
}
