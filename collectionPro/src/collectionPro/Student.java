package collectionPro;

public class Student {
//	필드
	private int sno;
	private	String name;
	private String major;
	private	int score;

	
//	생성자
	public Student() {
		super();
	}

	public Student(int sno, String name, String major, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	
//	getter & setter
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

//	메소드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sno + " " + name + " " + major + " " + score;
	}

			
	
	
}
