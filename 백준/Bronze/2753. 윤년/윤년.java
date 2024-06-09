import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		in.close();
        
		System.out.print((y % 4 == 0) ? ((y % 400 == 0) ? "1" : (y % 100 == 0) ? "0" : "1") : "0");
	}
}