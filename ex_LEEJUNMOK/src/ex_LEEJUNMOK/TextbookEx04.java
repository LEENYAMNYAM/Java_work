package ex_LEEJUNMOK;

import java.util.Scanner;

public class TextbookEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		<연습문제 실습문제04 p126>
//		'일', '월', '화', '수', '목', '금', '토'로 초기화 된 문자 배열 day를 선언하고, 
//		사용자로부터 정수를 입력받아 7(배열 day의 크기)로 나눈 나머지를 인덱스로 하여 배열 day에 저장된 문자를 출력하라. 
//		음수가 입력되면 프로그램을 종료하라.
		
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"}; 
		String input = "";
		int inputInt = 0;
		int index = -999;
		
//		정수를 입력받는 무한 루프 생성
		while(true) {
			System.out.print("정수를 입력하세요>>");
			input = sc.next();
			
//			정수를 입력하지 않았을 경우 다시 입력	
			try{
				inputInt =Integer.valueOf(input);
			}catch(NumberFormatException e){
				System.out.println("경고! 수를 입력하지 않았습니다.");
				continue;
			}
//			음수를 입력했을 시 종료
			if(inputInt<0) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}else{
//			올바른 정수를 입력했을 경우
				index = inputInt % 7 ;
				System.out.println(day[index]);				
			}	
		}
		
		sc.close();
		
	}

}
