import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum, count, start, end;
		sum = count = start = end = 1;
		
		while (end != N) {
			if (sum == N) {
				end++;
				sum += end;
				count++;
			}else if (sum > N) {
				sum -= start;
				start++;
			}else {
				end++;
				sum += end;
			}
		}
		
		System.out.println(count);
	}

}