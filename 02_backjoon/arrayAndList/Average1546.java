package arrayAndList;

import java.util.Arrays;
import java.util.Scanner;

public class Average1546 {

	public static void main(String[] args) {
		// 문자열로 받고 split으로 나눠서 숫자로 변환
		// 그 중에 최대값? stream 이용해보자
		// 다시 배열 돌면서 점수 변환
		// 더하고 나눠서 평균 구하기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String none = sc.nextLine(); // enter 값 없애주기
		String[] sNumArr = sc.nextLine().split(" ");
		int[] numArr = new int[N];
		for (int i = 0; i < sNumArr.length; i++) {
			numArr[i] = Integer.parseInt(sNumArr[i]);
		}
		long max = Arrays.stream(numArr).max().getAsInt(); // Stream을 이용해 배열 최대값 구하기
		long sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println(sum * 100.0 / max / N);
		
		
		// 문자열로 받지 않고 바로 숫자형으로 받는 더 간단한 풀이
//		int A[] = new int[N];
//		for (int i = 0; i < N; i++) {
//			A[i] = sc.nextInt();
//		}
		sum = 0;
		max = 0;
		
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (temp > max) {
				max = temp;
			}
			sum += temp;
		}
		System.out.println(sum * 100.0 / max / N);
	}

}
