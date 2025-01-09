package ex_LEEJUNMOK;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		<실습문제1_1>
//		지불할 금액을 정수로 입력 받아 화폐단위가 각각 몇 개씩 필요한지 출력하는 프로그램을 작성하시오.
//		입력은 최소 10만원 단위로 입력, 
//		화폐단위는 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 10가지이며,
//		가능한 큰 화폐단위로 지불, 입력이 236,873이면 50000원권 4매, 10000원권 3매, 5000원권 1매,
//		1000원권 1매, 500원 1매, 100원권 3매, 50원권 1매, 10원권 2매, 5원권 0매, 1원권 3개로 출력하라. 
//		단 화폐단위는 배열에 저장한다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("지불할 금액(최소 10만원 이상)을 입력해주세요.(종료를 원하시면 exit를 입력하세요)");
			String input = sc.next();
			
//		exit 입력시 무한루프 탈출 
			if(input.equals("exit")) break;
			
//		문자를 입력하여 정수형으로 변경 불가시 다시 입력.
            int payment;
            try {
                payment = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("유효한 금액을 입력해주세요.");
                continue;
            }
           
//      10만원 이하 입력시 다시 입력.
			if(payment < 100000){
				System.out.println("10만원 이하의 금액을 입력하셨습니다.");
				continue;
			}else{
				
//		올바르게 입력했을 시 단위 금액별 매수 출력
				System.out.println(payment + "원 을 입력하셨습니다.");
	
				int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
				int[] unitNum = new int[10];
				int temp = payment;
		
				for(int i = 0 ;  i < unit.length ; i++) {
					unitNum[i] = temp/unit[i] ;
					System.out.println(unit[i] + "원권 " + unitNum[i] + "매");
					temp = (temp%unit[i]);
				}
				System.out.println("을 지불하시면 됩니다.");
			}
		}
//		무한루프 탈출시 종료 알림
		System.out.println("프로그램을 종료합니다...");
		sc.close();
	}
}
