package ex_LEEJUNMOK05;

public class Ex06_5_Graduate extends Ex06_5_Student{
//	필드
	private String aType;
	private boolean award;

//	생성자
	public Ex06_5_Graduate() {
		super();
	}

	public Ex06_5_Graduate(String name, int sno, String major, String grade, int earnedCredits, String aType, boolean award) {
		super(name, sno, major, grade, earnedCredits);
		this.aType = aType;
		this.award = award;
	}

//	getter & setter
	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public boolean isAward() {
		return award;
	}

	public void setAward(boolean award) {
		this.award = award;
	}
	
//	메소드
	public void Print() {
		super.Print();
		System.out.printf("조교 유형 : %s\t장학금 여부 : %b\t", aType, award);
	}

}
