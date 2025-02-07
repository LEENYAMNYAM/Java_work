package ex_LEEJUNMOK07_1;

import java.util.HashMap;
import java.util.Scanner;

public class ex_LEEJUNMOK07_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("--------------------------------------------");
		System.out.println("나라이름과 인구를 입력하세요. (예 : Korea 5000)");
		
		while(true) { 
			System.out.print("나라 이름, 인구>> ");
			
//			나라이름 입력받음.
			String nation = sc.next();
			
//			입력값이 '그만'이면 첫번째 반복문을 벗어남.
			if(nation.equals("그만")) {
				break;
			}
//			인구수 입력받음.
			int pop = 0 ;
			try {
				pop = Integer.parseInt( sc.next() );
			}
			catch(Exception e){
				System.out.println("잘못 입력하셨습니다. 바르게 입력해주세요.");
				continue;
			}
			
//			받은 값을 HASHMAP에 저장
			nations.put(nation, pop);
		}
		
		while(true) {
//			해쉬맵에 저장된 값이 하나도 없다면 반복문 바로 생략
			if(nations.isEmpty()) {
				System.out.println("입력된 값이 없습니다.");
				break;
			}
			
			System.out.print("인구 검색 >> ");
			
			String nation = sc.next();
			
			
//			입력값이 '그만'이면 첫번째 반복문을 벗어남.
			if(nation.equals("그만")) {
				break;
			}else if(nations.get(nation) == null) {
				System.out.println(nation +" 나라는 없습니다.");
			}else {
				System.out.println( nation +" 인구는 " +  nations.get(nation) );
			}
		
		}			
			
		System.out.println("End");		
	
	}

}
