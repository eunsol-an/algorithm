import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			int time = 0;
			int time2 = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
            
			for (int j = 0; j < 2; j++) {
				int h = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
                
				if (j == 0) {
					time = (h * 3600) + (m * 60) + s;					
				} else {
					time2 = (h * 3600) + (m * 60) + s;
				}
			}
			time2 -= time;
            
			System.out.println(time2 / 3600 + " " + (time2 % 3600) / 60 + " " + (time2 % 3600) % 60);
		}
	}
}