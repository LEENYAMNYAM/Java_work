package ch03;

public class OpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=3;
		double num3=3.0;
		int result1=num1++;		// num1++ : result1에 대입을 먼저하고 num1 값을 1증가 후 변수에 대입
		int result2=++num1;		// ++num1 : num1 값을 1증가 후 변수에 대입
		
		System.out.println(num1);
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1/num3);  //묵시적으로 실수형으로 결과가 나옴
		System.out.println(num1%num2);  //나머지 구하는 연산
	
		/* 복합대입 연산자 */
		
		num1+=5;
		System.out.println(num1);
		num1-=5;
		System.out.println(num1);
		num1*=5;
		System.out.println(num1);
		num1/=5;
		System.out.println(num1);
		num1%=7;
		System.out.println(num1);	
		
	}

}
