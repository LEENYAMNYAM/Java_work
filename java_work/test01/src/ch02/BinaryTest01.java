package ch02;

public class BinaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;   
		int bNum=0B1010;  // 0B : 2진법
		int oNum=012;     // 0 : 8진법  
		int hNum=0XA;	  // 0X : 16진법
		
		int bNum2=0B00000000000000000000000000000101;
		int bNum3=0B11111111111111111111111111111011;
		
//		byte bNum4=0B10001111;
		
//		ctrl + / : 선택한 행 모두 주석처리, 다시 누르면 주석처리 사라짐.(자주활용)
//		ctrl shift + / : /*이용한 주석처리. 되돌릴 수 없음.
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		System.out.println(bNum2);
		System.out.println(bNum3);
		System.out.println(bNum2+bNum3);
		
	}

}
