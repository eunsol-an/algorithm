package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputAndOutput1026 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		System.out.printf("%d", m);
	}
}
