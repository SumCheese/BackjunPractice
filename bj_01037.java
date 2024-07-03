package Backjun;

import java.util.*;

public class bj_01037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("put integer : ");
		int N = sc.nextInt();
		
		int[] a = new int[N];
		
		for(int i = 0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = 0;
		int min = 1000000;
		
		for(int i = 0; i<N; i++) {
			if(max < a[i]) {
				max = a[i];
			}
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println(max*min);
		
		
		
	}

}
