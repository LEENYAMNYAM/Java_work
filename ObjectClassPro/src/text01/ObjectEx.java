package text01;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	아래 toString을 오버라이딩 안하면 자신의 레퍼런스값이 리턴되고 
	// 아래와 같이 쓰면 아래에 설정해둔 값으로 리턴됨.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	// 수정한 메소드 내용
		return "x:" + x + ", y:" + y ;
	//	원래 메소드 내용
	//	return super.toString();
	}

//	마찬가지로 equals를 오버라이딩 하면 리턴값을 바꿀수 있다.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	
	// 수정한 메소드 내용
	Point other = (Point)obj;	//down casting	
	if(this.x==other.x && this.y ==other.y)
		return true;
	else
		return false;
	//	원래 메소드 내용
	//	return super.equals(obj);
	}
	
}


public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		System.out.println(p1.getClass());
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		
//		위에 toString 메소드 설정한것에 따라 값이 달라짐.
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));

	}

}
