import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] ch = new char[5][15];
        int max = 0;

        for (int i = 0; i < ch.length; i++) {
            String str = br.readLine();
            max = Math.max(str.length(), max);

            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (char[] chars : ch) {
                if (chars[i] == '\0') continue;
                sb.append(chars[i]);
            }

        }
        System.out.println(sb);
    }
}