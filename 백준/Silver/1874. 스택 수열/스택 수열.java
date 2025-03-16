import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int sequenceNum = Integer.parseInt(br.readLine());

            if (sequenceNum >= num) {
                while (sequenceNum >= num) {
                    stack.push(num);
                    sb.append("+\n");
                    num++;
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int top = stack.pop();
                if (top > sequenceNum) {
                    System.out.println("NO");
                    return;
                } else {
                    sb.append("-\n");
                }
            }
        }

        System.out.println(sb);
    }
}
