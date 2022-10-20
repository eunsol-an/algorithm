package arrayAndList;

import java.util.Scanner;

public class SumOfNumbers11720 {
	// Point!
	// N의 범위가 1부터 100까지이므로 int형, long형과 같은 숫자형으로 담을 수 없음

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// split을 이용한 풀이
		String[] nums = sc.next().split("");
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += Integer.parseInt(nums[i]);
		}
		System.out.println(result);
		
		// toCharArray를 이용한 풀이
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
		
	}

}
