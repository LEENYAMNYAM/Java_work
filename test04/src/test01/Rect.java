package test01;

public class Rect {

	int width;
	int height;
	
	public Rect() {
		
	}
	
	public Rect(int w, int h) {
		width = w;
		height = h;
	}
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect();
		System.out.println(r1.width);
		System.out.println(r1.height);
		System.out.println(r1.getArea());
		
	}

}
