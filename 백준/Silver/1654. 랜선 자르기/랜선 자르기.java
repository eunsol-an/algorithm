import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long max = 0;
        long mid = 0;
        long min = 0;
        int l[] = new int[K];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            l[i] = number;
            if (number>max){
                max = number;
            }
        }
        max++;
        long n;
        while (min < max) {
            n = 0;
            mid = (min + max) / 2;
            for (int i = 0; i < K; i++) {
                n += (l[i]/mid);
            }
            
            if (n < N) max = mid;
            else min = mid + 1;
        }
        System.out.print(min - 1);
    }
}