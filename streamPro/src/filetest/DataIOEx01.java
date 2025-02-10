package filetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Student {
//	필드
	private int sno;
	private String name;
	private int score1;
	private int score2;
	private int score3;
	private int rank;
//	생성자
	public Student(int sno, String name, int score1, int score2, int score3) {
		this.sno = sno;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.rank = 1;
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

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public int getScore3() {
		return score3;
	}

	public void setScore3(int score3) {
		this.score3 = score3;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	//	메소드
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d", sno, name, score1, score2, score3);
    }
	public int Sum() {
		int sum = (score1 + score2 + score3);
		return sum;
	}
	public double Avg() {
		double avg = (score1 + score2 + score3)/3.0;
		return avg;
	}
}


public class DataIOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		BufferedWriter bw;
		
		ArrayList<Student> students = new ArrayList<>();
		
		try {
			fr = new FileReader("d:/JMT/JAVA/workspace/data.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("d:/JMT/JAVA/workspace/result.txt");
			bw = new BufferedWriter(fw);
			
			String s;
			while( (s=br.readLine()) != null ) {
				String[] sp = s.split("\\s+");
				if (sp.length < 5) continue;
				int sno = Integer.parseInt( sp[0] );
				String name = sp[1];
				int score1 = Integer.parseInt( sp[2] );
				int score2 = Integer.parseInt( sp[3] );
				int score3 = Integer.parseInt( sp[4] );
				
				students.add( new Student(sno, name, score1, score2, score3) );
				
			}
			
			for(Student student : students) {
				for (Student other : students) {
					if(other.Sum() > student.Sum()) {
						student.setRank(student.getRank()+1);
					}
				}
			}
			
			for(Student student : students) {
				bw.write(student.toString() + "\t" +
						 student.Sum() + "\t" +
						 String.format("%.2f", student.Avg()) + "\t" +
						 student.getRank() + "\n");
			}
			
			bw.flush();
			br.close();		fr.close();
			bw.close();		fw.close();
			
		}catch(IOException ex) {
			System.out.println("IO Error : " + ex.getMessage());
		}
		
	}

}
