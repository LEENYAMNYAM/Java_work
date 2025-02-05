package ex_LEEJUNMOK07;

public class Ex7_7_Location {

//	필드
	private int x;
	private int y;

//	생성자
	public Ex7_7_Location() {
		this.x=0;
		this.y=0;
	}

	public Ex7_7_Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

//	getter & setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	메소드
//	public double Distant(int x, int y) {
//		double d = Math.sqrt(x*x + y*y);
//		return d;
//	}

	
}
