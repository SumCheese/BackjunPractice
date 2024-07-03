package Backjun;

import java.util.*;
import java.io.*;
  
public class bj_10814 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		System.out.println("È¸¿ø ¼ö : ");
		int N = sc.nextInt();
		int[] age = new int[N];
		String[] name = new String[N];
		
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			age[i] = Integer.parseInt(st.nextToken());
			name[i] = st.nextToken();
		}
		
		
		
	}
}
