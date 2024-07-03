package Backjun;

import java.io.*;
import java.util.*;

public class bj_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("integer :");
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("num : ");
			numbers[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(numbers);
		
		br.close();
		
		for(int j = 0; j<n; j++) {
			bw.write(Integer.toString(numbers[j])+"\n");
		}
		bw.flush();
		bw.close();
	}

}
