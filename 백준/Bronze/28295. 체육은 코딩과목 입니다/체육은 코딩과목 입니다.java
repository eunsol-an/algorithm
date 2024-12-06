import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int total = 0;
		
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			total += a;
		}
		
		if (total % 4 == 0) {
			System.out.println("N");
		} else if (total % 4 == 1) {
			System.out.println("E");
		} else if (total % 4 == 2) {
			System.out.println("S");
		} else if (total % 4 == 3) {
			System.out.println("W");
		}
	}
}