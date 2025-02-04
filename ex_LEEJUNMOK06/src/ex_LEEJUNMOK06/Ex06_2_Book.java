package ex_LEEJUNMOK06;

public class Ex06_2_Book {
//	필드
	private	String title;
	private	int pages;
	private String writer;
	
//	생성자
	public Ex06_2_Book() {
	}
	
	public Ex06_2_Book(String title, int pages, String writer) {
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}

//	getter & setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

//	메소드
	@Override
	public String toString() {
		return "title=" + title + ", pages=" + pages + ", writer=" + writer + " ";
	}
	
	
	
}
