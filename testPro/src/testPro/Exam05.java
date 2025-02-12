package testPro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<>();
		
		//학생성적 입력
		System.out.println("학생의 이름과 점수를 입력하세요. (예 : 홍길동 80)");
		while(true) {
			System.out.print("학생 이름, 점수>> ");
			String name = sc.next();
			
			//그만입력시 다음으로 넘어감
			if(name.equals("그만")) break;
			
			String scoreString = sc.next();
			// 점수를 int로 형변환
			int score = Integer.parseInt(scoreString);
			//hashMap 데이터 입력
			h.put(name, score);
		}
		
		//학생성적 검색
		while(true) {
			System.out.print("학생의 성적 검색 >>");
			String search = sc.next();
			
			//그만 입력시 프로그램 종료
			if(search.equals("그만")) break;
			
			if(h.get(search) == null) {
					System.out.println(search + "은(는) 등록된 데이터가 아닙니다.");
			}else {
					System.out.println(search + "의 점수는 " + h.get(search) + "점입니다." );
			}
		
		}
		System.out.println("End");
	}

}
