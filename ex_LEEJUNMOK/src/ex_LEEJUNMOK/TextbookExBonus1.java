package ex_LEEJUNMOK;

public class TextbookExBonus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		<연습문제 실습문제 Bonus1>
//		다음은 3X4의 2차원 배열을 만들고 
//		이곳에 0~9 범위의 정수를 랜덤하게 저장한 후 
//		2차원 배열과 합을 출력하는 프로그램의 실행 결과와 코드이다. 
//		빈곳에 적절한 코드를 삽입하라.
//		0	4	4	7
//		7	9	2	4
//		9	1	2	7
//		합은 56
		
		int intArray[][];	// 2차원 정수 배열 선언
		intArray = new int[3][4];
		
		//12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				intArray[i][j] = (int)(Math.random()*10);	// 0~9d의 랜덤정수
		
		// 3X4 배열을 출력한다.
		for(int i=0; i < intArray.length; i++){
			for(int j=0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + "    ");	// 원소[i][j] 출력
				System.out.println();	// 다음 줄로 넘어감	
		}
		
		// 3X4 배열의 합을 구하여 출력한다.
		int i = 0, sum=0;
		while(i<3) {
			for(int j=0 ; j < intArray[i].length; j++)
				sum+=intArray[i][j];
				i++;
		}
		System.out.println("합은 " + sum);
	}

}
