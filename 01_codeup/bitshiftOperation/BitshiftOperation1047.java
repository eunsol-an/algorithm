package bitshiftOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitshiftOperation1047 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.printf("%d", num<<1);
	}
}
