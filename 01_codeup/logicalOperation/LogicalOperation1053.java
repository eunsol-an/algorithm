package logicalOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperation1053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.print(a != 0 ? 0 : 1);
	}
}
