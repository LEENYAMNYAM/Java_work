package ch03;

import java.util.Scanner;

public class OpEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학 점수를 입력해주세요.");
		int score1 = sc.nextInt();
		System.out.println("과학 점수를 입력해주세요.");
		int score2 = sc.nextInt();
		
		int mean = (score1 + score2) / 2 ;
		
		String result = (mean >= 70) ? "합격" : "불합격" ;
		char result1 = (mean >= 70) ? 'T' : 'F' ;
		boolean result2 = (mean >= 70) ? true :false ;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		sc.close();
		
	}

}

