import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char hangul = sc.nextLine().charAt(0);
		sc.close();

		System.out.println((int) hangul - 44031);

	}

}