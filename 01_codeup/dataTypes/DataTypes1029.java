package dataTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes1029 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double num = Double.parseDouble(br.readLine());
		System.out.printf("%.11f", num);
	}
}
