package BackJun;


import java.util.*;

public class bj_1292 {
	public static void main(String[] args) {
		
		int[] arr = new int[1001];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i < 46; i++) {
			for(int j = i*(i-1)/2; j< i*(i+1)/2; j++) {
				if(j+1 == 1001) {
					break;
				}
				arr[j+1] = i;
			}
		}
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		
		for(int i = start; i<=end; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	}
} 
