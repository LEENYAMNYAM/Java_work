package packagepro;

class Score{
	private int sno;
	private String name;
	private String dept;
	private int[] scores;
	private double avg;
	private int rank=1;
	
	public Score(int sno, String name, String dept, int[]scores) {
		this.sno=sno;
		this.name=name;
		this.dept=dept;
		this.scores=scores;
	}
	
	public void total_avg() {
		int total = 0;
		for(int i=0 ; i < scores.length ; i++) {
			total+=scores[i];
		}
		avg = (double)total / scores.length;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void display() {
		System.out.printf("%d, %s, %s, ", sno, name, dept);
		for(int i=0; i < scores.length; i++) {
			System.out.printf("%d, ", scores[i]);
		}
		System.out.printf("%5.2f, %d%n", avg, rank);
	}
	
}


public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Score[] arrayScore = new Score[3];
		
		int[] scores1 = {70, 80, 75};
		arrayScore[0] = new Score(1,"kim", "컴공", scores1 );
		arrayScore[0].total_avg();
		int[] scores2 = {80, 80, 75};
		arrayScore[1] = new Score(2,"lee", "정컴", scores2 );
		arrayScore[1].total_avg();
		int[] scores3 = {90, 80, 75};
		arrayScore[2] = new Score(3,"pack", "정보통신", scores3 );	
		arrayScore[2].total_avg();
		
		for(int i=0; i <arrayScore.length; i++) {
			int rank = 1;
			for(int j=0; j < arrayScore.length; j++) {
				if(arrayScore[i].getAvg() < arrayScore[j].getAvg()) {
					rank++;
				}
			}
			arrayScore[i].setRank(rank);
		}
		
		for(int i=0; i < arrayScore.length; i++) {
			arrayScore[i].display();
		}
	
	}
}
