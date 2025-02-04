package stringPro;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3 + 5";
		StringTokenizer st = new StringTokenizer(s,"+-*/%", true);	//구분자도 토큰으로 넣고 싶다면 마지막 매개변수로 true를 적으면 됨.
		int num1 = Integer.parseInt(st.nextToken().trim());
		String op1 = st.nextToken();
		int num2 = Integer.parseInt(st.nextToken().trim());
		System.out.println(num1);
		System.out.println(op1);
		System.out.println(num2);
	}

}
