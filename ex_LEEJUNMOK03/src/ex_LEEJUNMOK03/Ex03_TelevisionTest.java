package ex_LEEJUNMOK03;

//	<3번 문제>
//	다음 프로그램에서 잘못된 부분을 모두 지적하고 올바르게 수정하시오. 그리고 수정된 후의 출력 결과를 쓰시오.

class Television{
	private String model;
	
	void setModel(String b) {	//setter(설정자)
		model = b;
	}
	
//	답안1) getter는 반환값이 필요하므로 void가 아니라 model의 변수형을 따라 가야함.
//	void getModel() {			//getter(접근자)
	String getModel() {         //1번 수정답안)	
		return model;		
	}
}

public class Ex03_TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		답안2)
//		Television t = new Television;
//		새로이 선언해주어야 하고, 새롭게 선언할때 Television 뒤에 ()를 써야함. 그리고 괄호를 쓰려면 기본 생성자를 만들어줘야함.
		Television t = new Television();    // 2번 수정답안)
		
		t.setModel("STV-101");
//		String b = getModel();		//답안3) Television 이라는 객체의 참조변수명 t를 써야함.
		String b = t.getModel();	// 3번 수정답안)
	}

}
