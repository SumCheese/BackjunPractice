package BackJun;

import java.util.*;

public class bj_1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Rev(Rev(a)+Rev(b)));
	}
	
	public static int Rev(int x) {
		String str = Integer.toString(x);
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		String num = "";
		for(int i = str.length()-1; i>-1; i--) {
			num += arr[i];
		}
		
		return Integer.parseInt(num);
	}
}