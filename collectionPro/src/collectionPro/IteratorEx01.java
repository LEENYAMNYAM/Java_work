package collectionPro;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {	// it.hasNect() : it 객체가 next를 가지고 있다면 true 없다면 false
			System.out.println(it.next());
		}
	}
}
