import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nums = sc.next().split("");
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += Integer.parseInt(nums[i]);
		}
		System.out.println(result);
		
	}

}