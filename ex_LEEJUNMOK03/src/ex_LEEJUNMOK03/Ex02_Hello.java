package ex_LEEJUNMOK03;

//	<2번 문제>
//	다음 프로그램의 실행 결과는 무엇일까? 이유를 설명하라. 

public class Ex02_Hello {
	public static void main(String[] args) {
		Object x = null;
		giveMeAString(x);
		System.out.println(x);
	}
	
	static void giveMeAString(Object y) {
		y = "This is a string";
//		System.out.println(y);
	}
}

//	<답변>
//		실행결과는 null이며, y값은 giveMeAString 메소드 안에서만 변경 된 후 giveMeAString 메소드가 끝나는 순간 종료 되어 사라진다.
//		즉, x값이 바뀌는 것이 아니므로 x는 null의 값을 그대로 갖게 된다.
//      This is a string을 출력하고 싶다면  giveMeAString 메소드 안에 변경되어 있는 y값을 출력하면 된다.