package Backjun;

import java.util.*;

public class bj_25206 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sub, grade;
		Double score = 0.0;
		Double grade_score = 0.0;
		Double sum = 0.0;
		Double sum_score = 0.0;
		
		
		for(int i = 0; i<20; i++) {
			//System.out.println("과목명 : ");
			sub = sc.next();
			//System.out.println("학점 : ");
			score = sc.nextDouble();
			//System.out.println("과목평점 : ");
			grade = sc.next();
			
			
			switch(grade) {
			case "A+" :  grade_score = 4.5;
						 break;
			case "A0" :  grade_score = 4.0;
			 			 break;
			case "B+" :  grade_score = 3.5;
			 			 break;
			case "B0" :  grade_score = 3.0;
			 			 break;
			case "C+" :  grade_score = 2.5;
			 			 break;
			case "C0" :  grade_score = 2.0;
			 			 break;
			case "D+" :  grade_score = 1.5;
			 			 break;
			case "D0" :  grade_score = 1.0;
			 			 break;
			case "F" :   grade_score = 0.0;
			 			 break; 
			}
			if(grade.equals("P")) {
				continue;
			}
			sum += score;
			
			sum_score += grade_score * score;
			
		}
		System.out.printf("%.6f",sum_score/sum);
		
		
		
	}

}
