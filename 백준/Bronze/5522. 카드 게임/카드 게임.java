import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            result += score;
        }

        System.out.println(result);
    }
}