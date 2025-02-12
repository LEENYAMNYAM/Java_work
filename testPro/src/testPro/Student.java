package testPro;

public class Student {
	
//	필드
	private int sno;
	private String name;
	private int kScore;
	private int eScore;
	private int mScore;

//	생성자
	public Student() {
		super();
	}

	public Student(int sno, String name, int kScore, int eScore, int mScore) {
		super();
		this.sno = sno;
		this.name = name;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
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

	public int getkScore() {
		return kScore;
	}

	public void setkScore(int kScore) {
		this.kScore = kScore;
	}

	public int geteScore() {
		return eScore;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
		
//	메소드
	//합계
	public int sum() {
		int sum = kScore + eScore + mScore;
		return sum;			
	}
	//평균
	public double avg() {
		double avg = (double)(sum() / 3);
		return avg;
	}
	
}
