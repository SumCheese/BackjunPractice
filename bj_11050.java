package Backjun;

import java.util.*;

public class bj_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert N and K : ");
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int num1 = factorial(N);
		int num2 = factorial(N-K);
		int num3 = factorial(K);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println(num1 / num2 / num3);
		
		
	}
	
	static int factorial(int n) {
		int num = 1;
		int temp = 1;
		while(temp != n+1) {
			num = num * temp;
			temp++;
		}
		return num;
	}

}
