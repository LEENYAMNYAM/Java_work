package collectionPro;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		객체 입력
		Vector<Student> v = new Vector<>();
		v.add(new Student(1,"유재석", "컴공", 90));
		v.add(new Student(2,"안연석", "기계", 75));
		v.add(new Student(3,"안유진", "정통", 95));
		v.add(new Student(4,"장원영", "화공", 65));
		v.add(new Student(5,"아이유", "조선", 85));
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		
//		점수가 최대 객체 출력
		Iterator<Student> it = v.iterator();
		Student maxS = it.next();
		System.out.println(maxS);
		while(it.hasNext()) {
			Student s = it.next();
			if(maxS.getScore() < s.getScore()) {
				maxS = s;
			}
		}
		System.out.println(maxS);
		
		
		
		
		
	}

}
