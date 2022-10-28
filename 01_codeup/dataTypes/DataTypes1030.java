package dataTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes1030 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long num = Long.parseLong(br.readLine());
		System.out.print(num);
	}
}
