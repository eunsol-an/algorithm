import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 우선순위큐(PriorityQueue): 들어간 순서와는 상관없이 높은 우선순위를 가진 원소가 먼저 나옴
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) {
                return o1 > o2 ? 1 : -1; // 우선순위를 주고 싶은 쪽에 음수값 return
            } else {
                return abs1 - abs2;
            }
        });

        for (int i = 0; i < N; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            if (inputNum == 0) {
                if (queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
            } else {
                queue.add(inputNum);
            }
        }
    }
}
