package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputAndOutput1025 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) {
			System.out.printf("[%c%s]\n" ,s.charAt(i), s.substring(i+1).replaceAll(".", "0"));
		}
	}
}
