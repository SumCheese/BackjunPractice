package Backjun;

import java.util.*;

public class bj_01094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put Integer : ");
		
		int num = sc.nextInt();
		int cnt = 0;
		
		int[][] a = new int[7][2];
		for(int i = 0; i<7; i++) {
			int temp = 1;
			for(int j = 0; j<i; j++) {
				temp *= 2;
			}
			a[i][0] = temp;
			a[i][1] = 0;
		}
		
		for(int i = 6; i>-1; i--) {
			if(num >= a[i][0]) {
				num -= a[i][0];
				a[i][1] = 1;
			}
		}
		
		for(int i = 0; i<7; i++) {
			if(a[i][1] == 1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	

}
