package testPro;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = " ";
		
		while(true) {
			System.out.print("소문자 알파벳 하나를 입력하세요>> ");
			input =  sc.next();
			
			// 입력한 문자가 소문자를 입력했는지(ASKII가 97 이상 122 이하인지 확인하고
			// 1글자만 입력했는지도 확인
			if( 97<=(int)(input.charAt(0)) && 
			    (int)(input.charAt(0))<=122 && 
			    input.length()==1){
				//똑바로 입력했다면 한글자를 char형으로 저장
				char tmp = input.charAt(0);
				//반복문을 통해 a까지 출력
				for(int i = 97 ; i <= (int)tmp ; i++) {
					for(int j = 97 ; j <= i; j++) {
						System.out.print((char)j);
					}
					System.out.println();
				}
				break;
			//입력을 바르게 하지 않았을 때
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}
	

}
