package ex_LEEJUNMOK05;

public class Ex06_5_UnderGraduate extends Ex06_5_Student{
//	필드
	private String club;

//	생성자
	public Ex06_5_UnderGraduate() {
		super();
	}

	public Ex06_5_UnderGraduate(String name, int sno, String major, String grade, int earnedCredits, String club) {
		super(name, sno, major, grade, earnedCredits);
		this.club = club;
	}

//	getter & setter
	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
//	메소드
	public void Print() {
		super.Print();
		System.out.printf("소속동아리 : %s\t", club);
	}
}
