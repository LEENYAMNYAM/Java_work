package arraypro;

public class ArrayTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for-each문 연습
//		1번 int
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for (int k : num)
			sum +=k;
		System.out.println("합은 " + sum);
		
//		2번 String
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도" };
		for(String s : names)
			System.out.print(s+" ");
		
		System.out.println();
		
//		3번 enum
//		enum 상수
		
		enum Day {월, 화, 수, 목, 금, 토, 일}
		Day monday=Day.월;
		System.out.println(monday);
		
		Day[] days=Day.values();
		
//		enum Week {월, 화, 수, 목, 금, 토, 일}
//		for(Week day : Week.values())
//			System.out.print(day + "요일 ");
	}

}
