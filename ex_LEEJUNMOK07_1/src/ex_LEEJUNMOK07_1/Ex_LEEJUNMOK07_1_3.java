package ex_LEEJUNMOK07_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_LEEJUNMOK07_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		객체 입력
		System.out.println("--------------------------------------------");
		System.out.println("학생이름, 학과, 학번, 학점 평균을 입력하세요.");
		
		for(int i=0; i<5; i++) {
			String name = sc.next();
			String major = sc.next();
			int sno = sc.nextInt();
			double score = sc.nextDouble();
		
			Student s1;
			a.add(s1 = new Student(name, major, sno, score));
		}
		System.out.println("--------------------------------------------");
//		입력값 전체 출력하기
		for(int i=0; i<a.size(); i++) {
			a.get(i).Print();
			System.out.println("--------------------------------------------");
		}
		
//		
	
	}

}
