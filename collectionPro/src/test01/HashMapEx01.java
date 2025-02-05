package test01;

import java.util.HashMap;
import java.util.Scanner;

import collectionPro.Student;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(1, new Student(1, "유재석", "컴공", 95));
		map.put(2, new Student(2, "안연석", "정컴", 90));
		map.put(3, new Student(3, "안유진", "기계", 70));
		map.put(4, new Student(4, "장원영", "화공", 65));
		map.put(5, new Student(5, "아이유", "통계", 85));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("학번 입력>>");
			int sno = sc.nextInt();
			
			if(sno == 0) {
				System.out.println("시스템 종료");
				break;
			}
			
			Student s = map.get(sno);
			if(s==null) {
				System.out.println("데이터 없음");
			}else {
				System.out.println(s);
			}
		}
	}

}
