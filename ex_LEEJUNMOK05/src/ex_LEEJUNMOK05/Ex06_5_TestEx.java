package ex_LEEJUNMOK05;

public class Ex06_5_TestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex06_5_UnderGraduate UG1 = new Ex06_5_UnderGraduate("유재석", 101, "컴공", "3학년", 84, "날자날어");
		Ex06_5_UnderGraduate UG2 = new Ex06_5_UnderGraduate("안연석", 102, "컴공", "3학년", 87, "돌고돌아");
		Ex06_5_Graduate G1 = new Ex06_5_Graduate("안유진", 201, "전자공학", "2학년", 51, "교육 조교", false);
		Ex06_5_Graduate G2 = new Ex06_5_Graduate("장원영", 202, "세포생물", "3학년", 61, "연구 조교", true);
		
		UG1.Print();
		System.out.println();
		UG2.Print();
		System.out.println();
		G1.Print();
		System.out.println();
		G2.Print();
		
	}

}
