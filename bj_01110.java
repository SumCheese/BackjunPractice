package Backjun;

import java.util.*;

public class bj_01110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put Integer : ");
		
		int num = sc.nextInt();
		int temp = num;
		
		int a = 0;
		int b = 0;
		int c = 0;
		int cnt = 0;
		
		do {
			a = temp/10;
			b = temp%10;
			c = (a+b)%10;
			
			temp = b*10 + c;
			cnt++;
		}	while(temp != num);
		
		System.out.println(cnt);
		
		
		
	}
}
