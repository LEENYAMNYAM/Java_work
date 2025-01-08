package ex_LEEJUNMOK;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		<실습문제1_2>		
//		임의의 수자를 입력하여 369게임을 간단하게 작성. 1-99까지 정수를 입력하고 3,6,9 중 하나가 있는 
//		경우 ‘박수짝’을 출력하고, 두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라.
		
		int ranNum = (int)(Math.random()*99) + 1 ;
		System.out.println("선택한 번호 : " + ranNum);
		
		for(int i=1 ; i <= ranNum ; i++){
			int digit1 = i%10;
			int digit2 = i/10;
			int clapCount = 0;
			
//			1의 자리수와 10의 자리수에 3,6,9가 있는지 확인
			if(digit1==3 || digit1==6 || digit1==9) {
				clapCount++;
			}
			if(digit2==3 || digit2==6 || digit2==9) {
				clapCount++;
			}
			
//			clapCount가 2면 "박수짝짝"
//			clapCount가 1면 "박수짝"
//			그 외의 값은 숫자 출력
			
			if(clapCount==2) {
				System.out.println("박수짝짝");
			}else if(clapCount==1) {
				System.out.println("박수짝");
			}else {
				System.out.println(i);
			}
		}
	}

}
