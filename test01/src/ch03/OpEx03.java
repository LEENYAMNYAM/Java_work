package ch03;

public class OpEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i=i+2) < 10);	//앞조건에 의해서 뒷조건이 아예 실행되지 않음.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10)||((i=i+2) < 10);				//앞조건에 의해서 뒷조건이 아예 실행되지 않음.
		System.out.println(value);		
		System.out.println(num1);										// 앞조건은 실행이 되었기 때문에 20,30으로 변수값이 바뀜
		System.out.println(i);											//11,16행 때문에 변화없이 2의 값이 출력됨.
		
		
		
	}

}
