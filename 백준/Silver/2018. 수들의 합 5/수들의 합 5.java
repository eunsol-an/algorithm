import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum, count, start_index, end_index;
		sum = count = start_index = end_index = 1;
		
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