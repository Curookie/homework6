package homework6;

import java.util.Scanner;

public class SecondMax {
	
	public SecondMax() {
		Scanner s = new Scanner(System.in);
		String input = "";
		int[] num = new int[10];
		int i=1;
		int fstn = 0; // first 값 초기화
		int secn = 0; // second 값 초기화
		int fsti = 1; // first 인덱스 값
		int seci = 2; // second 인덱스 값
		boolean fstSameSec = true; // first 값과 second 값이 같을 때 체크하는 플러그 변수 
		System.out.println("================================");
		
		while(true) {
			if(i>10) { System.out.println(); break; }
			System.out.print(i+"번째 수를 입력하시오 : ");
			input = s.nextLine();
			if(!(input.matches("^[0-9]+$")||input.matches("^[-]{1}[0-9]+$"))) { System.out.println("\n 제대로 입력하세요!"); continue; } 
			if(i==1) fstn=Integer.parseInt(input);
			if(fstn!=Integer.parseInt(input)) { secn=Integer.parseInt(input); seci=i; fstSameSec=false; }
			num[i-1]=Integer.parseInt(input);			
			i++;
		} 
		
		if(fstSameSec) { System.out.println("두 번째로 큰 수가 없습니다."); return; }
		
		for(int a=0;a<9;a++) {
			if(num[a+1]>fstn) {
				secn=fstn;
				fstn=num[a+1];
				
				seci=fsti;
				fsti=a+1;
			}
			else if(num[a+1]==fstn) {
				continue;
			}
			else if(num[a+1]>secn) {
				secn=num[a+1];
				
				seci=a+1;
			}
		}
		System.out.println("두번째로 큰 수는 "+seci+"번째수 "+secn+"입니다.");
	}
	
	
}
