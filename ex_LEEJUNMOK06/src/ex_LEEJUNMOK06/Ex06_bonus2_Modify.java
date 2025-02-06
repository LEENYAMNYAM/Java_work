package ex_LEEJUNMOK06;

import java.util.Scanner;

public class Ex06_bonus2_Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random()*s.length());
			while(true) {
				int i = (int)(Math.random()*26); // 랜던한 알파벳의 ASKII 번호 가져오기위해
				char c = (char)('a' + i);	// ASKII를 이용해서 문자로 바꿔주기
				if(!sb.equals(c)) {
					//sb에서 index에 있는 문자를 문자 c로 변경
					sb.replace(index, index+1 , Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}

}
