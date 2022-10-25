package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNApassword12891 {
	// 배열로 받고
	// 투포인터 이용해서 조건 걸어서
	// 해당하면 count++

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		String arr[] = br.readLine().split("");
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		// 문자열 그대로? 배열에 넣어서?
		// 문자열 그대로면 charAt(0) 이런식으로
		// 배열에 넣으면 A[0] 이런식으로
		
		int i = 0;
		int j = P - 1;
		
		while (j < S) {
			
		}
	}

}
