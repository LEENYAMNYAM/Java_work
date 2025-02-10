package ex_LEEJUNMOK07_1;

public class Student {
//	필드
	private String name ; 
	private String major;
	private int sno;
	private double score;
//	생성자
	public Student() {
	}

	public Student(String name, String major, int sno, double score) {
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.score = score;
	}
//	getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
//	메소드
	public void Print() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + sno);
		System.out.println("학점 평균 : " + score);
	}
	
	
	
	
}
