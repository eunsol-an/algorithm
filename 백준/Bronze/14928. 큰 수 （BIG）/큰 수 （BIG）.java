import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine();
		long remainder = 0;
		for (int i = 0; i < num.length(); i++) {
			remainder = (remainder * 10 + (Character.getNumericValue(num.charAt(i)))) % 20000303;
		}
		
		bw.write(remainder + "");
		bw.close();
		br.close();
	}
}