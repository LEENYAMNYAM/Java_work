package ex_LEEJUNMOK03;

//  08번 문제

class Plane{
//	필드
	private String company;
	private String model;
	private int max_passenger;
	static int planes = 0 ;
	
//	생성자
	public Plane() {
	}
	public Plane(String company) {
		this.company = company;
	}
	
	public Plane(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public Plane(String company, String model, int max_passenger) {
		this.company = company;
		this.model = model;
		this.max_passenger = max_passenger;
	}
	
	
//	setter&getter
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMax_passenger() {
		return max_passenger;
	}

	public void setMax_passenger(int max_passenger) {
		this.max_passenger = max_passenger;
	}
	
	public static void setPlanes() {
		planes += 1;
	}
	public static int getPlanes() {
		return planes;
	}

//	메소드
	 public void print() {
		 System.out.printf("회사 : %5s \t 모델명 : %5s \t 최대 수용 승객 : %5d " , company , model , max_passenger);
		 System.out.println();
		 setPlanes();
		 }
}

public class Ex08_PlaneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		p1.setCompany("대한한공");
		p1.setModel("B747");
		p1.setMax_passenger(368);
		p1.print();
		
		Plane p2 = new Plane("아시아나");
		p2.setModel("A350");
		p2.setMax_passenger(311);
		p2.print();
		
		Plane p3 = new Plane("에어부산", "A320");
		p3.setMax_passenger(180);
		p3.print();
		
		Plane p4 = new Plane("진에어", "B737", 189);
		p4.print();
		
		System.out.println("배정된 비행기 수 : " + Plane.getPlanes());
		
	}

}
