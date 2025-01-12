package ex_LEEJUNMOK;

import java.util.Scanner;

public class TextbookEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		<연습문제 실습문제06 p127>
//		다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만들고, 
//		사용자로부터 영어 단어를 입력 받아 한글을 출력하는 프로그램을 작성하라.
//		"exit"를 입력하면 프로그램을 종료하라.
//		String eng[] = {"student", "love", "java", "happy", "future"}
//		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"}
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean result = false;
		
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			input = sc.next();
			
//			exit를 입력하면 반복문 탈출 및 프로그램 종료
			if(input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			for(int i = 0 ; i<eng.length ; i++ ) {
				if( input.equals(eng[i]) ){
//					영어단어가 입력값과 일치하면 한국어로 출력하고,
//					result를 true로 변경(false일 때 만 입력오류를 말해주기 위해)하고,
//					result값이 false로 바뀌지 않도록 for문 탈출.
					System.out.println( kor[i] );
					result = true;
					break;
				}else{
//					입력값과 같은 영어단어가 업다면 result를 false로 유지
					result = false;	
				}	
			}
//			입력값이 영어단어와 같은게 없을 시(result가 false일 때) 멘트 출력
			if(result==false) {
				System.out.println("그런 영어 단어가 없습니다.");
			}
		}
		sc.close();
	}

}