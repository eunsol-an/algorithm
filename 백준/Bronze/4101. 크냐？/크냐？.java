import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				break;
			}
			
			System.out.println(num1 > num2 ? "Yes" : "No");
		}
	}
    
}