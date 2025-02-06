package collectionPro;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(7);				//최근버전은 뒤에<>안의 Integer은 생략가능 
		v.add(5);
		v.add(4);
		v.add(-1);

		int n=v.size();
		int c=v.capacity();
		System.out.printf("n = %d, c = %d%n", n, c);
		for(int i = 0 ; i < v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("---------------------------------------------------");
		
		v.add(2,10);	// 2번째 위치에 10을 넣어라!! 10이 먼저 출력되고 -1이 출력되는것을 확인할 수 있음.
		for(int i = 0 ; i < v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("---------------------------------------------------");
		
		v.remove(1);	// 인덱스번호1에 있는 값을 지워라
		
		for(int i = 0 ; i < v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("---------------------------------------------------");
		
		System.out.println(v.lastElement());
		
		System.out.println("---------------------------------------------------");
//		전체 삭제
		v.clear();
		v.removeAll(v);
		n=v.size();
		c=v.capacity();
		System.out.printf("n = %d, c = %d%n", n, c);
		for(int i = 0 ; i < v.size();i++) {
			System.out.println(v.get(i));
		}	// 다 지워져서 데이터가 없음.
		
		System.out.println("---------------------------------------------------");
		n=v.size();
		c=v.capacity();
		System.out.printf("n = %d, c = %d%n", n, c);
		for(int i=0; i <20; i++) {
			v.add((int)(Math.random()*100+1));
		}
		
		System.out.println("---------------------------------------------------");
		n=v.size();
		c=v.capacity();
		System.out.printf("n = %d, c = %d%n", n, c);
		for(int i = 0 ; i < v.size();i++) {
			System.out.println(v.get(i));
		}
		
	}	

}
