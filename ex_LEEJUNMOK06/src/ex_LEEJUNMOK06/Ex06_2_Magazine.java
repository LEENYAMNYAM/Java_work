package ex_LEEJUNMOK06;

public class Ex06_2_Magazine extends Ex06_2_Book{
//	필드
	private String date;

//	생성자
	public Ex06_2_Magazine() {
	}

	public Ex06_2_Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
	}

//	getter & setter
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
//	메소드
	@Override
	public String toString() {
		System.out.print(super.toString());
		return "date=" + date;
	}
	
}
