package ex_LEEJUNMOK06;

public class Ex06_3_Food {

	private int cal;
	private int cost;
	private int kg;
	
	public Ex06_3_Food() {};
	public Ex06_3_Food(int cal, int cost, int kg) {
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
