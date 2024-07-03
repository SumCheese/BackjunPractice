package Backjun;

import java.util.*;

public class bj_01436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert N: ");
		int N = sc.nextInt();
		int n = 0;
		int num = 665;
		
		while(N != n) {
		num++;
		if(Integer.toString(num).contains("666")) {
			n++;
			}
		}
		
		System.out.println(num);
		
		
		
	}
}
