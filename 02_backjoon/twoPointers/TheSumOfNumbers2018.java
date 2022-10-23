package twoPointers;

import java.util.Scanner;

public class TheSumOfNumbers2018 {
	// while문으로 index 처음부터 끝까지 훑어
	// 이동원칙에 따라 if문 걸어서 이동시켜
	// 마지막에 count 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
//		한번에 여러개 초기화 가능
//		int sum, count, start_index, end_index;
//		sum = count = start_index = end_index = 1;
		
		int sum = 1;
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		
		while (end_index != N) {
			if (sum > N) {
				sum -= start_index;
				start_index++;
			}else if (sum < N) {
				end_index++;
				sum += end_index;
			}else if (sum == N) {
				end_index++;
				sum += end_index;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
