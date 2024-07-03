package Backjun;

import java.io.*;
import java.util.*;

public class bj_07568 {
	public static void main(String[] args) throws IOException {
		System.out.println("사람 수: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
		int[][] person = new int[N][2]; 
		for(int i = 0; i<N; i++) {
			System.out.println("키와 몸무게 :");
			int weight = sc.nextInt();
            int height = sc.nextInt();
            
			person[i][0] = weight;
			person[i][1] = height;
		}
		
		for(int i = 0; i<N; i++) {
			int i_weight = person[i][0];
			int i_height = person[i][1];
            int rank = 1;
			for(int j = 0; j<N; j++) {
				if(i == j) continue;
				int j_weight = person[j][0];
				int j_height = person[j][1];
				
				if(i_height < j_height && i_weight < j_weight) {
					rank++;
				}
			}
            System.out.print(rank+" ");
		}
		
		
		
	}
}
	

