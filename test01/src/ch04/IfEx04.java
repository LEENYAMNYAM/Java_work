package ch04;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		/*조건문 실습*/
		
		
		
		/* 1. 두 과목의 점수를 입력받아 평균70점이상, 두 과목이 모두 60점이상일때 합격을 출력하고
		 * 90점이상은 1등급, 80점이상은 2등급, 70점이상은 3등급을 출력하라*/
		
//		System.out.println("수학점수를 입력하세요.");
//		int score1 = sc.nextInt() ;
//		System.out.println("과학점수를 입력하세요.");
//		int score2 = sc.nextInt();
//		double avg = (score1 +score2) / 2 ;
//		String result;
//		String grade = "-";
//		
//		if((avg >= 70) && (score1 >= 60) && (score2 >= 60)) {
//			result = "합격" ;
//			
//			if(avg >= 90 ) {
//				grade = "1";
//			}else if(avg >= 80) {
//				grade = "2";
//			}else
//				grade = "3";
//			
//		}else
//			result = "불합격" ;
//		
//		System.out.println("합격여부 : " + result);
//		System.out.println("평균점수 : " + avg + "점");
//		System.out.println("합격등급 : " + grade + "등급");

		
	
		/*2. 숫자 3개를 입력받아 가장 큰 수를 출력하라*/
		
//		System.out.println("임의의 숫자 3개를 차례로 입력하시오.");
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		
//		double max_value;
//		if(a>=b) {
//			if(a>=c) {
//				max_value = a;
//			}else
//				max_value = c;	
//		}else
//			max_value =b;
//		
//		System.out.println("가장 큰 수는 : " + max_value);
		
		
		
		/*3. 음료수의 종류와 잔수를 입력받아 가격을 알려주는 프로그램을 작성하라.
		 * 1. 에스프레소 : 2000
		 * 2. 아메리카노 : 2500
		 * 3. 카푸치노 : 3000
		 * 4. 카페라떼 : 3500*/
		
//		System.out.println("|◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆자동 음료 판매기◆◇◆◇◆◇◇◆◆◇◆◇◆◇◆◇◆|");
//		System.out.println("| 1. 에스프레소 : 2000원     | 3. 카푸치노  : 3000원     | ");
//		System.out.println("| 2. 아메리카노 : 2500원     | 4. 카페라떼  : 3500원     |");
//		System.out.println("|◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆자동 음료 판매기◆◇◆◇◆◇◇◆◆◇◆◇◆◇◆◇◆|");
//		
//		int dNum ;
//		int numberOfDrinks ;
//		
//		while(true) {
//		System.out.println("원하시는 음료수의 번호를 입력해주세요.(1 ~ 4)");
//		dNum = sc.nextInt() ;
//		
//		if(!(1<=dNum && dNum<=4)) {
//			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
//			continue ;
//		}
//		System.out.println( dNum + "번을 선택하셨습니다.");
//		
//		System.out.println("원하시는 잔의 개수를 입력해주세요.");
//		numberOfDrinks = sc.nextInt() ;
//		if(numberOfDrinks>=1) {
//			break ;
//		}else{	
//			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
//			continue ;
//		}
//		
//		}
//		
//		int price = 0;
//		String drinkName = "";
//		
//		if(dNum == 1) {
//			drinkName = "에스프레소" ;
//			price = 2000 ;
//		}else if(dNum == 2) {
//			drinkName = "아메리카노" ;
//			price = 2500 ;
//		}else if(dNum == 3) {
//			drinkName = "카푸치노" ;
//			price = 3000 ;
//		}else if(dNum == 4) {
//			drinkName = "카페라떼" ;
//			price = 3500 ;
//		}else{
//			System.out.println("잘못입력하셨습니다.");
//		}
//		
//		int charge = price * numberOfDrinks ;
//		
//		System.out.println(drinkName + numberOfDrinks + "잔을 선택하셨습니다." + "총 가격은 "+ charge +"원 입니다.");
		
		
		
		/*4. 월을 입력하면 계절을 출력해주세요.*/
	
		int month;
		String season;
			
		while(true) {	
			System.out.println("몇 월인지 입력하세요.");
			month = sc.nextInt();
			if (3<=month && month<=5) {
				season ="봄";
			}else if (6<=month && month<=8) {
				season ="여름";
			}else if (9<=month && month<=11) {
				season ="가을";
			}else if (12==month || (1<=month & month<=2)) {
				season ="겨울";
			}else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				continue ;
			}
			break ;
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
		sc.close();
	}
	
}
