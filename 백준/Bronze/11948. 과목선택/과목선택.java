import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int[] arr = new int[4];
		int[] arr2 = new int[2];
        
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int sum = arr[1] + arr[2] + arr[3];
		arr2[0] = Integer.parseInt(br.readLine());
		arr2[1] = Integer.parseInt(br.readLine());
		Arrays.sort(arr2);
		sum += arr2[1];
		
		System.out.println(sum);
	}
}