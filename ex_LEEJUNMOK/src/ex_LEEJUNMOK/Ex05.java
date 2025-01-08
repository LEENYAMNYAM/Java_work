package ex_LEEJUNMOK;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		<실습문제1_5>
//		크기가 10인 배열을 작성하고 Math.random()함수를 사용하여 
//		1~100사이의 숫자를 랜덤하게 생성하고 
//		생성된 숫자가 3의 배수인 것만 배열에 저장하는 프로그램을 작성하라. 
//		(단 배열의 각 요소는 서로 다른 값만 저장되도록 한다.)
		
		int[] DB = new int[10];
		int ranNum = -999;
		int tmp = -999;
		int count = 0;
		
		while(true) {
//			배열이 가득 차면 반복문 탈출
			if(count==10) break;
			
			ranNum =(int)(Math.random()*100) + 1 ;
			System.out.println("입력받은 랜덤 수는 : " + ranNum + "입니다.");
			
//			랜덤수가 기존의 배열에 있는 수인지 확인하여 같은 수이면 tmp에 저장
			for(int i=0 ; i<10 ; i++) {
				if(ranNum==DB[i]) {
					tmp = DB[i];
					break;
				}else {
					tmp=-999;
				}
			}
//			랜덤수와 같은 수가 있으면 다시 입력(while문 다시 시작)
			if(tmp==ranNum) {
				tmp=-999;
				System.out.println("같은 숫자가 나왔습니다. 다시 랜덤수를 출력합니다.");
			}else {
//				3의 배수인지 확인
				if(ranNum%3==0) {
//					3의 배수이면 배열에 추가하고 count를 1증가 시킴.
					System.out.print(ranNum + "은 3의 배수입니다.");
					DB[count]=ranNum;
					count++;
				}else {
					
//				3의 배수가 아니라면 반복문 다시 실행
				}
			}
				    
		}
//		저장된 배열 출력
		System.out.print("저장된 배열은 { ");
		for(int i=0 ; i<10 ; i++) {
			System.out.print(DB[i]+ " ");
		}
		System.out.println("} 입니다.");
	}

}
