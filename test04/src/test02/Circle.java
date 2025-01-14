package test02;

public class Circle {

	int radius;
	public String name;
	
	public Circle() {
	}
	
	public Circle(int r) {
		radius = r;
	}
	
	public Circle(int r, String name) {
		radius = r;
		this.name = name;
	}
	
//	setter
	void set(int r) {
		radius=r;
	}
	
//	getter
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10);
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		System.out.println(donut.getArea());
		
		double area = pizza.getArea();
		System.out.println(area);
	}

}
