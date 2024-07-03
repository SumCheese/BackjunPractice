package Backjun;

import java.util.*;

public class bj_01157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put String : ");
		
		String word = sc.next();
		
		word = word.toUpperCase();
		char[] a = word.toCharArray();
		
		char[] arr = new char[26];
		int[] cnt = new int[26];
		for(int i = 0; i<26; i++) {
			int temp = i + 65;
			arr[i] = (char)(i+65);
			cnt[i] = 0;
		}
		
		for(int i =0 ;i<a.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(a[i] == arr[j]) {
					cnt[j]++;
				}
			}
		}
		int result = 0;
		int max = 0;
		
		for(int i = 0; i<26; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				result = i;
			}
			
			else if(max == cnt[i]) {
				max = -1;
				break;
			}
		}
		
		if(max == -1) {
			if(word.length() == 1) {
				System.out.println(word.toUpperCase());
			}
			else {
				System.out.println("?");
			}
		}
		else {
			System.out.println(arr[result]);
		}
		
		
		
	}
}
