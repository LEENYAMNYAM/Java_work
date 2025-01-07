package ch02;

public class DoubleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		예제1
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
//		예제2
		double dnum1 = 1;
		
		for(int i = 0; i<10000; i++) {
			dnum1 = dnum1 + 0.1;
		}
		System.out.println(dnum1);
		
		double dnum2 = 1;
		
		for(int i = 0; i<10000; ++i) {
			dnum2 = dnum2 + 0.1;
		}
		System.out.println(dnum2);
				
	}

}
