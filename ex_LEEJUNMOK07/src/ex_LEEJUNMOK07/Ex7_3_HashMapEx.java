package ex_LEEJUNMOK07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex7_3_HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashMap 선언
		HashMap<String, Integer> h = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
//		HashMap 자료 입력
		h.put("에스프레소", 2000);
		h.put("아메리카노", 2500);
		h.put("카푸치노", 3000);
		h.put("카페라떼", 3500);
		
//		주문 반복문 시작
		while(true) {
			System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
			System.out.println("원하시는 음료를 작성해 주세요");
			System.out.print("주문 >> ");
			String order = sc.next();
			
			// 그만 입력시 종료
			if(order.equals("그만")) {
				System.out.println("시스템 종료");
				break;
			}
			
			//switch문을 이용하여 가격 출력
			switch(order) {
			case "에스프레소" : System.out.println("에스프레소는 "+ h.get(order) + "원 입니다.");break;
			case "아메리카노" : System.out.println("아메리카노는 "+ h.get(order) + "원 입니다.");break;
			case "카푸치노" : System.out.println("카푸치노는 "+ h.get(order) + "원 입니다.");break;
			case "카페라떼" : System.out.println("카페라떼는 "+ h.get(order) + "원 입니다.");break;
			default : System.out.println("잘못된 주문입니다. 다시 주문해 주시기 바랍니다.");break;
			}
			
		}
	}

}
