package inputOutput;

import java.util.Scanner;

public class InputAndOutput1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String num = sc.next();
		String[] spread = num.split("\\.");
		System.out.println(spread[0]);
		System.out.println(spread[1]);
	}

}
