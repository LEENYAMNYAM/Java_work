package testPro;

public class Exam03_ColorPoint extends Point {
	private String color;
	
	public Exam03_ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public void setPoint(int x, int y) {
		super.move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println(color + "색으로 (" + super.getX() +", " + super.getY() +")");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam03_ColorPoint cp = new Exam03_ColorPoint(5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("PINK");
		cp.show();
		
	}

}
