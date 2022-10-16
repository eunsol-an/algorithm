package inputOutput;

import java.util.Scanner;

public class InputAndOutput1020 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		String[] spread = date.split("-");
		System.out.println(spread[0] + spread[1]);
	}
}
