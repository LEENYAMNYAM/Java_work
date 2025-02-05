package ex_LEEJUNMOK07;

import java.util.Scanner;
import java.util.Vector;

//	교재 p317~p318
//	7장 컬렉션과 제네릭

public class Ex7_1_VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Double> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		v.add(3.14);
		v.add(2.2);
		v.add(-5.5);
		v.add(99.9);
		v.add(33.7);
		
		int maxIndex = 0;
		
		for(int i=1; i<v.size(); i++) {
			if(v.get(maxIndex) < v.get(i)) {
				maxIndex = i;
			}
		}
		System.out.println("가장 큰 값은 : " + v.get(maxIndex));
		
		sc.close();
	}

}
