package ch01;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true) {
//			System.out.println("while");
//		}
		
//		do{
//			System.out.println("do_while");
//		}while(true);
		
//		for(;;) {
//			System.out.println("for");
//		}
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("대소문자 변환, 소문자 입력, 종료조건 : quit 입력");
			String s = sc.next();
			if(s.equals("quit"))
				break;
			char ch=s.charAt(0);
			System.out.println((char)(ch-32));
		}
		sc.close();	
	}

}
