package homework6;

import java.util.Scanner;

public class StudentScore {
	public StudentScore() {
		Scanner s = new Scanner(System.in);
		
		String input = "";
		String[] score = new String[3];
		double[][] num = new double[8][2];
		int i = 1;
		
		while (true) {
			if(i>5) { System.out.println(); break; }
			System.out.print(i+"번 학생 [국어 영어 수학] 띄어쓰기로 구분합니다. : ");
			input = s.nextLine();
			
			if(!input.matches("^[0-9]+[ ]{1}[0-9]+[ ]{1}[0-9]+$")) { System.out.println("\n ex)66 90 52 [국어][공백][영어][공백][수학]로 입력해주세요."); continue; } 
			score=input.split(" ");
			
			if(Integer.parseInt(score[0])>100||Integer.parseInt(score[1])>100||Integer.parseInt(score[2])>100) {
				System.out.println("제대로 입력해 주세요 :)");
			}
			
			num[i+2][0]=Integer.parseInt(score[0])+Integer.parseInt(score[1])+Integer.parseInt(score[2]);
			if(num[i+2][0]==0) num[i+2][1]=0; else num[i+2][1]=num[i+2][0]/3.;
			num[0][0]+=Double.parseDouble(score[0]);
			num[1][0]+=Double.parseDouble(score[1]);
			num[2][0]+=Double.parseDouble(score[2]);
			i++;
		}
		if(num[0][0]==0) num[0][1]=0; else num[0][1]=num[0][0]/3.;
		if(num[1][0]==0) num[1][1]=0; else num[1][1]=num[1][0]/3.;
		if(num[2][0]==0) num[2][1]=0; else num[2][1]=num[2][0]/3.;
		
		System.out.println("국어 총점은 "+String.format("%.0f",num[0][0])+"점이고, 평균은 "+String.format("%.1f", num[0][1])+" 입니다.");
		System.out.println("영어 총점은 "+String.format("%.0f",num[1][0])+"점이고, 평균은 "+String.format("%.1f", num[1][1])+" 입니다.");
		System.out.println("수학 총점은 "+String.format("%.0f",num[2][0])+"점이고, 평균은 "+String.format("%.1f", num[2][1])+" 입니다.");
		for(int a=3;a<8;a++) {
			System.out.println(a-2+"번 학생의 총점은 "+String.format("%.0f",num[a][0])+", 평균은 "+String.format("%.1f", num[a][1])+"이다.");
		}
	}
}
