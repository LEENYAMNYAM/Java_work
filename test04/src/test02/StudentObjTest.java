package test02;

import java.util.Scanner;

public class StudentObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students = new Student[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0  ; i< students.length ; i++) {
			System.out.println("학번 입력 : ");
			int sno = sc.nextInt();
			System.out.println("이름 입력 : ");
			String name = sc.next();
			System.out.println("전공 입력 : ");
			String major = sc.next();
			
			students[i] = new Student(sno, name, major);
		}
		for(Student s : students) {
			s.display();
		}
	}
}
