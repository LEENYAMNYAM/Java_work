package ex_LEEJUNMOK07;

import java.util.Scanner;

public class Ex7_7_ArrayListObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		Location 객체 생성
		Ex7_7_Location lo = new Ex7_7_Location();
				
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
		
//		거리합 변수
		double dSum = 0;
		
//		값 5개 입력받기 
		for(int i=0; i<5; i++) {
			System.out.print(">> ");
			
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			//현재위치(Location객체에 저장된 x,y값)과 금방 입력받은 x,y값을 이용하여 두 점사이의 거리계산 
			
			double d = Math.sqrt(Math.pow(lo.getX()-x, 2) + Math.pow(lo.getY()-y, 2));
			// 거리합 계산
			dSum += d;
			
			//Location 함수에 x값과 y값 저장
			lo.setX( x );
			lo.setY( y );
			
		}
//		(0,0)으로 돌아오는 거리 계산
		double d = Math.sqrt(Math.pow(lo.getX(), 2) + Math.pow(lo.getY(), 2));		
		dSum += d;
		
		System.out.println("총 이동 거리는 " + dSum);
		
	}

}
