import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if (2 * C > A + B) {
            System.out.println(A + B);
        } else {
            System.out.println(A + B - 2 * C);
        }
    }
}