package prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PrefixSum11659 {
	// i부터 j까지의 합
	// S[j] - S[i-1] = (S[j-1] + A[j]) - (S[i-2] + A[i-1])
	
	// 개수 N, 구해야 하는 횟수 M -> 둘다 100,000이 최대니까 최악은 100억번 그럼 100초..?
	// N개의 수를 배열로 받아
	// index로 접근하기 위해 -1
	// 합 배열 구하는 메서드 따로 생성
	// 구간 합을 구하는 메서드 따로 생성
	// 그걸 이후 들어오는 i와 j 대입해서 출력 -> 시간 초과
	
	// N개의 수를 받으면서 합 배열 바로 생성
	// 합 배열의 index 주의
	// 구간 합 공식으로 바로 정답 출력 초간단
	
	public static int sumArray(int[] A, int i) {
		int sum = 0;
		if ((i-1) > 0) {
			for (int j = 0; j < i; j++) {
				sum += A[j];
			}
		}
		return sum + A[i];
	}
	
	public static int interval(int[] A, int i, int j) {
		if (i > 0) {
			return sumArray(A, j) - sumArray(A, i-1);
		}
		return sumArray(A, j) - 0;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// 데이터의 범위를 고려하여 StringTokenizer 이용
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		
		long[]S = new long[N + 1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i <= N; i++) { // 범위 주의!
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for (int q = 0; q < M; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt(); 
//
//		int[] S = new int[N];
//		for (int i = 0; i < N; i++) {
//			if (i == 0) {
//				S[i] = sc.nextInt();
//			} else {
//				S[i] = S[i-1] + sc.nextInt();
//			}
//		}
//		for (int i = 0; i < M; i++) {
//			int n1 = sc.nextInt();
//			int n2 = sc.nextInt();
//			if ((n1-2) < 0) {
//				System.out.println(S[n2-1]);
//			} else {
//				System.out.println(S[n2-1] - S[n1-2]);				
//			}
//		}
	}

}
