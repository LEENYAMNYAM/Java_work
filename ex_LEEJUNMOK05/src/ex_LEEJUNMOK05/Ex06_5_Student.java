package ex_LEEJUNMOK05;

public class Ex06_5_Student {

	//	필드
	private String name;
	private int sno;
	private String major;
	private String grade;
	private int earnedCredits;

//	생성자
	public Ex06_5_Student() {
	}

	public Ex06_5_Student(String name, int sno, String major, String grade, int earnedCredits) {
		this.name = name;
		this.sno = sno;
		this.major = major;
		this.grade = grade;
		this.earnedCredits = earnedCredits;
	}

//	getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getEarnedCredits() {
		return earnedCredits;
	}

	public void setEarnedCredits(int earnedCredits) {
		this.earnedCredits = earnedCredits;
	}
	
//	메소드
	public void Print() {
		System.out.printf("이름 : %s\t학번 : %d\t학과 : %s\t학년 : %s\t이수학점 : %d\t", name, sno, major, grade, earnedCredits);
	}
}
