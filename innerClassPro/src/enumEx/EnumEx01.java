package enumEx;

interface Human1{
	int MAN = 1;
	int WOMAN = 2;
}

interface Machine1{
	int TANK = 1;
	int AIRPLANE = 2;
}


public class EnumEx01 {

	public static void createUnit(int kind) {
		switch(kind){
		case Machine1.TANK : System.out.println("탱크를 만듦"); break;
		case Machine1.AIRPLANE : System.out.println("비행기를 만듦"); break;	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createUnit(Machine1.TANK);
		createUnit(Human1.MAN);				// tank랑 값이 같기 때문에 탱크가 출력되어버림.
		createUnit(Machine1.AIRPLANE);
		createUnit(Human1.WOMAN);			// tank랑 값이 같기 때문에 탱크가 출력되어버림.
		
	}

}
