package ex_LEEJUNMOK07_1;

import java.util.Scanner;
import java.util.Vector;

public class ex_LEEJUNMOK07_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int prec = 0;
		
		System.out.println("------------------------------------------------------");
		
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			
//			강수량 입력받기
			try{
				prec = sc.nextInt();
			}catch(Exception e) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			
//			0입력시 종료
			if(prec == 0) {
				break;
			}else {
//			0이 아닐시 vector에 저장
				v.add(prec);
			}
			
//			평균 계산
			double avg = 0;
			for(int i = 0; i <v.size(); i++) {
				avg += v.get(i);
			}
			avg = avg / v.size();	
			
//			강수량(벡터값)들 모두 출력
			System.out.println(v);
//			평균 출력
			System.out.println("현재 평균 : " + avg );
			
		}
		
		System.out.println("End");
		System.out.println("------------------------------------------------------");
		
	}

}
