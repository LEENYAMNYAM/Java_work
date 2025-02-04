package stringPro;

import java.util.Random;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			int n=(int)(Math.random()*100)+1;
			System.out.println(n);
		}
		
//		random.nextInt(숫자) : 0이상 숫자미만의 정수형 난수를 만듦
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int n=r.nextInt(100) +1;	//1부터 100까지의 수를 만들어줌
			System.out.println(n);
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int i=0; i<10; i++) {
			int n=r.nextInt(50) +51;		// 51 ~ 100 사이의 정수를 만들어줌
			System.out.println(n);
		}
		
	}

}
