package ex_LEEJUNMOK06;

import java.util.Scanner;

//	교재 6장 연습문제 6번(p281)
public class Ex06_1_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		가위바위보 반복 하기
		while(true) {
		//사용자(user) 값 입력받기
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) >>");
			//사용자 숫자입력받기
			int userN = sc.nextInt();
			
			//사용자값이 4이면 게임종료
			if(userN == 4 ) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			//사용자 문자바꿔주기
			String user = null;
			switch(userN) {
			case 1 : user = "가위"; break;
			case 2 : user = "바위"; break;
			case 3 : user = "보"; break;
			default : user = "입력오류"; break;
			}
			
		//컴퓨터(com) 값 정하기
			// 컴퓨터 숫자 정하기
			int comN = (int)(Math.random()*3)+1;
			// 컴퓨터 문자 바꿔주기
			String com = null;
			switch(comN) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			default : com = "입력오류"; break;
			}			
			
		// 사용자(user)와 컴퓨터(com)의 값 출력하기
			System.out.println("사용자 "+ user +": 컴퓨터 "+ com );
			
		// 승부 결과 출력하기
			if(userN == comN) {
				//무승부
				System.out.println("무승부입니다.");
			}else if((userN==1 && comN==2) || (userN==2 && comN==3) || (userN==3 && comN==1)){
				//user 패
				System.out.println("사용자가 졌습니다.");
			}else if((userN==1 && comN==3) || (userN==2 && comN==1) || (userN==3 && comN==2)){
				//user 승
				System.out.println("사용자가 이겼습니다.");
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			
		}
	}

}
