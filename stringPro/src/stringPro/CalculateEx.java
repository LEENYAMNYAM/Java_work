package stringPro;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		

		
		while(true) {
			System.out.println("숫자1, 연산자, 숫자2를 입력하세요.");
			String input = sc.nextLine();
			if(input.equals("quit")) break;
			StringTokenizer st = new StringTokenizer(input, "+-*/%", true);
			int num1 = Integer.parseInt(st.nextToken().trim());
			String op = st.nextToken();
			int num2 = Integer.parseInt(st.nextToken().trim());

			switch(op) {
			case "+" : System.out.println(num1 + num2);break;
			case "-" : System.out.println(num1 - num2);break;
			case "*" : System.out.println(num1 * num2);break;
			case "/" : System.out.println(num1 / num2);break;
			case "%" : System.out.println(num1 % num2);break;
			default :
				System.out.println("연산자 입력 오류");
			}
		}
	sc.close();
	}
	
}
