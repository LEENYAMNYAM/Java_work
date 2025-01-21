package pk0121;

class A {
	public A () {
		System.out.println("생성자 A");
	}
	public A (int x) {
		System.out.println(x);
	}
}
class B extends A {
	public B () {
		System.out.println("생성자 B");
	}
	public B (int x) {
		super (x);
		System.out.println("생성자 B");
	}
	public B (int x, int y) {
		super (x);
		System.out.println(x+y);
	}
}
class C extends B {
	public C () {
		System.out.println("생성자 C");
	}
	public C (int x) {
		super(x);
		System.out.println("생성자 C");
	}
	public C (int x, int y, int z) {
		super(x);
		System.out.println(x+y+z);
	}
		
}


public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		C c2 = new C(2);	
		C c3 = new C(1,2,3);
	}

}
