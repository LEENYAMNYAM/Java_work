package ch02;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=3;
		int num=b;   // 묵시적 형변환
		b=(byte)num; // 명시적 형변환(저장되는 변수가 데이터 크기가 더 작을 때 주로 발생)
		
		int num1 = (int)(num + 3.5);	//묵시적형변환이 불가능 할때는 이렇게 명시적 형변환을 사용함.
		System.out.println(num1);
		
	}

}
