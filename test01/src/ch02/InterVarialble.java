package ch02;

public class InterVarialble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = -128;
		short s = 12456;
		int i = 1254545895;
		long l = 1045644585585445545L;
		char c1 = 'A';
		char c2 = 'a';
		char c3 = '가';
		int num1 = c1;  // ASKII code 번호로 변환
		int num2 = c2;
		int num3 = c3;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
