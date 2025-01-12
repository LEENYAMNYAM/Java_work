package ex_LEEJUNMOK;

import java.util.Scanner;

public class TextbookEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		<연습문제 실습문제08 p128>
//		컨퓨터와 사용자의 가위바위보 게임 프로그램을 작성하라. 
//		사용자가 입력하고<Enter> 키를 치면, 
//		컴퓨터는 랜덤하게 가위, 바위, 보 중 하나를 선택한다.
//		그리고 누가 이겼는지 출력한다.
//		"그만"을 입력하면 게임을 종료한다.
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String user = "";
		String com = "";
		boolean check = true;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
//		반복문 실행
		while(true) {
			System.out.print("가위 바위 보! >>");
			user = sc.next();
//			컴퓨터가 가위바위보중에 하나 고르기
			com = str[(int)(Math.random()*3)];			

			if(user.equals(com)) {
//				비겼을 떄
				System.out.println("사용자 = " + user + ", 컴퓨터 = "+ com + ", 비겼습니다.");
//				졌을 때
			}else if( 
				(user.equals("가위") && com.equals("바위")) || 
				(user.equals("바위") && com.equals("보")) ||
				(user.equals("보") && com.equals("가위"))) {
				System.out.println("사용자 = " + user + ", 컴퓨터 = "+ com + ", 컴퓨터가 이겼습니다.");
//				이겼을 때
			}else if((user.equals("가위") && com.equals("보")) || 
					(user.equals("바위") && com.equals("가위")) ||
					(user.equals("보") && com.equals("바위"))) {
				System.out.println("사용자 = " + user + ", 컴퓨터 = "+ com + ", 사용자가 이겼습니다.");
//				그만을 입력했을 떄 
			}else if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
//			잘못된 입력을 했을 때 
			else{
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
	
		}	
	}

}
