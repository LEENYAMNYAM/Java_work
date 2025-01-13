package ex_LEEJUNMOK;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		<실습문제1_4>
//		소문자 알파벳을 하나 입력받아서 다음과 같은 결과가 나타나도록 코드를 작성하시오. 
//		소문자 알파벳 하나를 입력하시오>> e
//		abcde
//		abcd
//		abc
//		ab
//		a
		
		Scanner sc = new Scanner(System.in);
		String alpha = " ";
		
		while(true) {
			System.out.print("소문자 알파벳 하나를 입력하시오>>");
//			소문자 알파벳을 하나 입력 받음.	
			alpha = sc.next();
			
//			소문자 알파벳을 입력했을 경우
//				(입력받은 값의 길이가 1이면서 입력받은 알파벳의 int값이 97이상~122이하인지 파악) 
			if( 97<=(int)(alpha.charAt(0)) && (int)(alpha.charAt(0))<=122 && alpha.length()==1) {
//				입력받은 문자를 char형으로 변형
				char tmp = alpha.charAt(0);
						
//				i는 행 j는 열이 됨
//				i는 알파벳을 int로 바꾼 값에서 부터 a의 int(97)값까지 1씩 작아짐
//				for(int i=(int)(tmp) ; i >= 97 ; i--) {
////					j는 97부터 i값까지 1씩 커짐(j를 char로 바꾸면 알파벳 출력)
//					for(int j=97 ; j <= i ; j++ ) {
//						System.out.print((char)(j));
//					}
//					System.out.println();       /* 줄바꿈 */	
//				}
				
//				위의 이중 for문의 조건을 char로도 할 수 있음.(char끼리 또는 char와 정수 사이의 연산이 가능하다)
				for(char c1 ='a'; c1<=tmp; c1++){
					for(char c2='a'; c2<=(tmp-c1)+97; c2++){
						System.out.print(c2);
					}
					System.out.println();
				}
				break;
			}else{
//			소문자 알파벳 이외의 값이 입력되면 다시 입력하도록
			}
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
				continue;
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}

}
