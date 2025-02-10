package streamPro;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr;
		FileWriter fw;
		
		try {
			fr = new FileReader("D:\\JMT\\JAVA\\workspace\\test.txt");
			fw = new FileWriter("D:\\JMT\\JAVA\\workspace\\test3.txt");
			int c;
			String st = "";
			while((c=fr.read()) != -1) {
				fw.write(c);
				st+=c;
			}
			fw.write(st);
			fr.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
		
	}

}
