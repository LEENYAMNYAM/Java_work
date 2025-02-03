package ex_LEEJUNMOK03;

//	<문제 5번>
//	(3) 
public class Ex05_03_MyClass {
	private String getName() {
		return "MyClass";
	}
//	public static String getClassName() {
//		return getName();			 
//오류 : static메소드에서는 아직 생성되지 않은 인스턴스 메소드(getName)를 불러올 수 없다.
//	}
}
