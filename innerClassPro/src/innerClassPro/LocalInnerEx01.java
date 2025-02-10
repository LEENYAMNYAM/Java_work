package innerClassPro;

class HumanCamp2{
	private int speed = 10;
	
	public void getMarine() {
		class Marine2{
			public void move() {
				System.out.printf("인간형 유닛이 %d속도로 이동%n", speed);
			}
		}
		Marine2 inner = new Marine2();
		inner.move();
	}
}



public class LocalInnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HumanCamp2 hc = new HumanCamp2();
		hc.getMarine();
		
	}

}
