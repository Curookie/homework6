package homework6;

import java.util.Scanner;

public class AvgScore {
	
	public AvgScore() {
		
		Scanner s = new Scanner(System.in);
		
		String input = "";
		double num[] = new double[10];
		int i = 1;
		double highn = 0.0;
		double lown = 0.0;
		double sum = 0.0;
		boolean highSameLow = true;
		
		System.out.println("================================");
		
		while (true) {
			if(i>10) { System.out.println(); break; }
			System.out.print(i+"번 심사점수 입력 : ");
			input = s.nextLine();
			if(!(input.matches("^[-]{1}[0-9]+[.]{1}[0-9]+$")||input.matches("^[0-9]+[.]{1}[0-9]+$")||input.matches("^[0-9]+$")||input.matches("^[-]{1}[0-9]+$"))) {
				System.out.println("\n제대로 입력해주세요!"); continue;
			}
			num[i-1] = Double.parseDouble(input);
			if(i==1) { highn=Double.parseDouble(input); }
			if(highn!=Double.parseDouble(input)) { lown=Double.parseDouble(input); highSameLow=false; }
			i++;
		}
		
		if(highSameLow) { System.out.println("가장 높은 수와 낮은 수가 없습니다."); return; }
		
		for(int a=0; a<10; a++) {
			if(num[a]>highn) {
				highn=num[a];
			}
			else if(num[a]<lown) {
				lown=num[a];
			}
			sum+=num[a];
		}
		
		if(sum-highn-lown==0) { System.out.println("가장 큰 점수와 가장 작은 점수를 제외한"); System.out.println("8개의 점수의 평균은 0 입니다."); return; }

		System.out.println("가장 큰 점수와 가장 작은 점수를 제외한");
		System.out.printf("8개의 점수의 평균은 %.2f 입니다.\n",(sum-highn-lown)/8);
	}
}
