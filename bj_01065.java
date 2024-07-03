package Backjun;

import java.util.*;

public class bj_01065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put Integer : ");
		
		int N = sc.nextInt();
		int[] a = new int[3]; 
		int cnt = 0;
		
		if(N < 100) {
			cnt = N;
		}
		else {
			cnt = 99;
			for(int i=100; i < N; i++) {
				int temp = i;
				a[2] = temp%10;
				a[1] = temp/10%10;
				a[0] = temp/100;
				
				if((a[0]-a[1]) == (a[1]-a[2])) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
