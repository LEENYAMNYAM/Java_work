package test01;

public class InstanceofEx {

		public static void main(String[] args) {
			//TODO Auto-gerated method stub
			Person jee = new Student();
			Person kim = new Professor();
			Person lee = new Researcher();
			
			System.out.println(jee instanceof Person);
			System.out.println(jee instanceof Student);
			System.out.println(kim instanceof Student);
			System.out.println(kim instanceof Professor);
			System.out.println(kim instanceof Researcher);
			System.out.println(lee instanceof Professor);
//			System.out.println(3 instanceof int);			//오류 : 객체만 가능
			System.out.println("java" instanceof String);   //String은 객체이므로 가능(java라는 변수의 부모가 String 객체)
		}
}
