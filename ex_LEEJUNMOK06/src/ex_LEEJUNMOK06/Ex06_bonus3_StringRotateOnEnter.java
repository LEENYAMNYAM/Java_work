package ex_LEEJUNMOK06;

import java.util.Scanner;

public class Ex06_bonus3_StringRotateOnEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		
		while(true) {
			String key = sc.nextLine();
			if(key.equals("")) {
				String first = text.substring(0,1);
				String last = text.substring(1);
				text = last + first;
				System.out.print(text + ">>");
			}
			else if(key.equals("q"))
				break;
			else
				System.out.println(text + ">>");
		}
		System.out.println("종료합니다...");
		sc.close();
	}

}
