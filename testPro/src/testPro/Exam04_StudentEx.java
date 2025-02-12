package testPro;

import java.util.Scanner;

public class Exam04_StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		
		//학생정보 입력
//		for(int i=0; i<5; i++) {
//			System.out.println("학번, 이름, 국어점수, 영어점수, 수학점수를 차례로 엔터를 치며 입력하세요.>> ");
//			int sno = sc.nextInt();
//			String name = sc.next();
//			int kScore = sc.nextInt();
//			int eScore = sc.nextInt();
//			int mScore = sc.nextInt();
//			
//			students[i] = new Student(sno, name, kScore, eScore, mScore);
//		}		
//		System.out.println("5명의 학생정보가 모두 저장되었습니다.");
		
		 students[0] = new Student(1, "홍길동", 80, 60, 70);
		 students[1] = new Student(2, "박경미", 90, 95, 80);
		 students[2] = new Student(3, "정희선", 75, 80, 100);
		 students[3] = new Student(4, "임혜동", 80, 70, 95);
		 students[4] = new Student(5, "조만현", 100, 65, 80);
		
		//모든 학생 정보 출력
		System.out.println("=======================================================");
		System.out.printf("%3s\t%5s\t%3s\t%3s\t%3s\t%4s\t%5s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("=======================================================");
		for(int i=0; i<5; i++) {
			int sno = students[i].getSno();
			String name = students[i].getName();
			int kScore = students[i].getkScore();
			int eScore = students[i].geteScore();
			int mScore = students[i].getmScore();
			int sum = students[i].sum();
			double avg = students[i].avg();
			System.out.printf("%3d\t%5s\t%3d\t%3d\t%3d\t%4d\t%5.1f\n", sno, name, kScore, eScore, mScore, sum, avg);
		}
		
	}

}
