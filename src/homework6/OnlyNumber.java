package homework6;

import java.util.Scanner;

public class OnlyNumber {
	
	public OnlyNumber() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		boolean chk=false;
		int i = 1;
		int num[] = new int[10];
		String input = "";
		
		System.out.println("================================");
		System.out.println("1~100사이의 숫자를 입력하세요.");
		while (true) {
			if(i>10) break;
			chk=false;
			System.out.print(i+"번째 숫자 : ");
			input = s.nextLine();
			if(!input.matches("^[0-9]+$")) { System.out.println("\n숫자만 입력가능합니다."); continue;}
			if(!(Integer.parseInt(input)>=1&&Integer.parseInt(input)<=100)) { System.out.println("\n 1~100사이의 숫자를 입력하세요."); continue; }
			
			num[i-1] = Integer.parseInt(input);
			
			for(int a=0;a<i-1;a++) {
				if(Integer.parseInt(input)==num[a]) { System.out.println("\n잘못 입력하였습니다. 다시 입력해주세요."); chk=true; break; }
			}
			
			if(chk) continue;
				
			i++;
		}
		
		for(int b=9;b>=0;b--) {
			System.out.println((b+1)+"번째 숫자는 "+num[b]+"입니다.");
		}
	}
}
