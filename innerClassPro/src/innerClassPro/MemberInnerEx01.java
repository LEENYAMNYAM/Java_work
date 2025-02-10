package innerClassPro;

class Outer1{
	private int speed = 10;
	
	class MemberInner1{
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동%n", speed);
		}
	}
	public void gerMarine() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}

public class MemberInnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out = new Outer1();
		out.gerMarine();
		
		Outer1.MemberInner1 inner = out.new MemberInner1();
		inner.move();
	}

}
