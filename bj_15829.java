package Backjun;

import java.util.*;
import java.io.*;

public class bj_15829 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println("num :  ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("String : ");
		String str = br.readLine();
		int sum = 0;
		
		char[] Alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] strArr = str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			int temp = 0;
			for(int j =0; j<Alphabets.length; j++) {
				if(strArr[i] == Alphabets[j]) {
					temp = j+1;
				}
			}
			for(int k = 0; k<i; k++) {
				temp = temp*31;
			}
			sum += temp;
			System.out.println(temp);
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
			
	}
}