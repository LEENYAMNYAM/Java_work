package ex_LEEJUNMOK03;

//	<문제 5번>
//	(1)

public class Ex05_01_Point {
	private int x, y;
	public void Point(int x, int y) {
		this.x = x;		//오류1 :  this써야함. 파라미터와의 구분을 위해
		this.y = y;	
	}
	
}
