import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String none = sc.nextLine();
		String[] sNumArr = sc.nextLine().split(" ");
		int[] numArr = new int[n];
		for (int i = 0; i < sNumArr.length; i++) {
			numArr[i] = Integer.parseInt(sNumArr[i]);
		}
		int max = Arrays.stream(numArr).max().getAsInt();
		Double sum = 0d;
		for (int i = 0; i < numArr.length; i++) {
			sum += ((double)numArr[i] / max * 100);
		}
		Double average = (double)sum/n;
		System.out.println(average);
	}

}