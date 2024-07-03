package Backjun;

import java.util.*;

public class bj_01032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("put integer : ");
		int N = sc.nextInt();
		
		String result = "";
		String[] b = new String[N];
		
		for(int i =0 ; i<N; i++) {
			System.out.println("put fileName : ");
			b[i] = sc.next();
		
		}
		
		int strLength = b[0].length();
		
		char[] a = new char[strLength];
		
		for(int i = 0; i<strLength; i++) {
			a[i] = b[0].charAt(i);
		}
		
		for(int i=1; i<N; i++) {
			for(int j =0; j<strLength; j++) {
				if(a[j] != b[i].charAt(j)) {
					a[j] = '?';
				}
			}
		}
		
		for(int i = 0; i<strLength; i++ ) {
			result += a[i];
		}
		System.out.println(result);
		
	}
}
