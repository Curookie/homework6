package homework6;

import java.util.Scanner;

public class AptPersonCount {
	
	public AptPersonCount() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		String input = "";
		int i = 1;
		int sum = 0;
		int flosum[] = new int[5];
		int numsum[] = new int[3];
		
		System.out.println("================================");
		while (true) {
			if(i>15) { break; }
			System.out.print((i+2)/3+"0"+((i-1)%3+1)+"호에 살고 있는 사람의 숫자 : ");
			input = s.nextLine();
			
			if(!input.matches("^[0-9]+$")) { System.out.println("\n숫자만 입력해주세요!"); continue; }
			
			sum += Integer.parseInt(input);
			flosum[(i-1)/3] += Integer.parseInt(input);
			numsum[(i-1)%3] += Integer.parseInt(input);
			i++;
		}
		
		System.out.println("이 아파트의 거주자는 모두 "+sum+"명 입니다.");
		
		for(int a=1;a<9;a++) {
			if(a<6) System.out.println(a+"층에 사는 거주자는 모두 "+flosum[a-1]+"명 입니다.");
			else { System.out.println((a-5)+"호 라인에 사는 거주자는 모두 "+numsum[a-6]+"명"); }
		}
	}
}
