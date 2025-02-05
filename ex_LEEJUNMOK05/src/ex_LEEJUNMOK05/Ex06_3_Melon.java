package ex_LEEJUNMOK05;

public class Ex06_3_Melon extends Ex06_3_Food {
	
	private String info;

	public Ex06_3_Melon() {
		super();
	}

	public Ex06_3_Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "cal=" + super.getCal() + " cost=" + super.getCost() + " kg=" + super.getKg() + " info=" + info + " ";
	}
	
	
	
	
	
}
