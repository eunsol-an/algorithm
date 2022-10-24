package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Jumong1940 {
	// M과 N을 받고 고유 번호들은 배열로 받기
	// 2중 반복문을 돌려서 합이 M이 되면 count 올려주기
	
	// 시간 복잡도를 고려했을 때 2중 반복문은 좋은 선택이 아님
	// 배열을 정렬한 후 투 포인터를 이용

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if (i == j) {
//					continue;
//				} else if (A[i] + A[j] == M) {
//					count++;
//				}
//			}
//		}
		
		// 투 포인터를 이용한 방법
		Arrays.sort(A);
		int count = 0;
		int i = 0;
		int j = N - 1;
		while (i < j) {
			if (A[i] + A[j] < M) {
				i++;
			} else if (A[i] + A[j] > M){
				j--;
			} else {
				i++;
				j--;
				count++;
			}
		}
		System.out.println(count);
	}

}
