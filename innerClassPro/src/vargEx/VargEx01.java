package vargEx;

public class VargEx01 {

//	public static void show(String str) {
//		System.out.println(str);
//	}
//	
//	public static void show(String str1, String str2 ) {
//		System.out.println(str1);
//		System.out.println(str2);
//	}
//	public static void show(String str1, String str2, String str3 ) {
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//	}
	
//	1번 : 가변인자를 안쓰면-------------------------------------------------------------------- 
	
	public static void showAll(String...varg) {
		for(String s:varg){
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	
	public static void showInt(int...varg) {
		for(int i:varg) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	
//	2번 : 가변인자를 쓰면--------------------------------------------------------------------	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		show ("abc");
//		show ("abcd", "가나다");
//		show ("abcd", "가나다", "010-2222-3333");
	
//		1번 : 가변인자를 안쓰면-------------------------------------------------------------------- 
		
		showAll ("abc");
		showAll ("abcd", "가나다");
		showAll ("abcd", "가나다", "010-2222-3333");
		
		showInt (10);
		showInt (10, 20);
		showInt (10, 20, 30);
		
		//단 형이 섞이는건 불가능
//		showAll ("abc", 123, 5678); 	
		 
//		2번 : 가변인자를 쓰면--------------------------------------------------------------------	
		
	}

}
