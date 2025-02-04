package collectionPro;

import java.util.Vector;

public class VectorEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<>();
		Point p = new Point(2,3);
		v.add(p);
		v.add(new Point(5,10));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for(int i=0; i < v.size(); i++) {
			System.out.println(v.get(i));
//			System.out.println(v.get(i).toString()); // 위에꺼랑 밑에꺼랑 똑같음. 안적어도 toString 해줌
		}
		System.out.println();
		v.remove(0);
		for(int i=0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
