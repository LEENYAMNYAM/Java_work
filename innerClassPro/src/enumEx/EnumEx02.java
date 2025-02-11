package enumEx;

enum Human2{MAN, WOMAN}
enum Machine2{TANK, AIRPLANE}


public class EnumEx02 {

	public static void createUnit(Machine2 kind) {
		switch(kind){
		case TANK : System.out.println("탱크를 만듦"); break;
		case AIRPLANE : System.out.println("비행기를 만듦"); break;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createUnit(Machine2.TANK);
//		createUnit(Human2.MAN);				// 지금은 Machine2의 열거형만 받기때문에 Human2은 못받음.
		
	}

}
