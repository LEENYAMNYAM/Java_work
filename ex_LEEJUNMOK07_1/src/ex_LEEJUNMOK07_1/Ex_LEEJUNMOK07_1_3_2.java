package ex_LEEJUNMOK07_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex_LEEJUNMOK07_1_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Student> h = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
//		객체 입력
		System.out.println("--------------------------------------------");
		System.out.println("학생이름, 학과, 학번, 학점 평균을 입력하세요.");
		
		for(int i=0; i<5; i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			int sno = sc.nextInt();
			double score = sc.nextDouble();
		
			Student s1;
			h.put(name, s1 = new Student(name, major, sno, score));
			
		}
		System.out.println("--------------------------------------------");
//		입력값 전체 출력하기
		//key값들 set으로 만들기
		Set<String> keys = h.keySet();
		//Iterator활용하기
		Iterator<String> it1 = keys.iterator();
		
		while(it1.hasNext()) {
			String key = it1.next();
			h.get(key).Print();
			System.out.println("--------------------------------------------");
		}
		
		
//		학생이름 입력시 해당 객체 출력하기
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			
			if(name.equals("그만")) break;
			else h.get(name).Print2();
			
		}
		
		System.out.println("시스템 종료");
		
	}

}

