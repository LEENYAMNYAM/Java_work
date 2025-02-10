package streamPro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr ;
		BufferedReader br;
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fr = new FileReader("d:/JMT/JAVA/workspace/system.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("d:/JMT/JAVA/workspace/system2.txt");
			bw = new BufferedWriter(fw);
		
		String s ;
		int i = 1;
		while((s=br.readLine()) != null) {
			System.out.println(i + ": "+ s);
			bw.write(i+": "+s+"\n");
			i++;
		}
		bw.flush();
		br.close();		fr.close();
		bw.close();		fw.close();
		
		}catch(IOException ex) {
			System.out.println("IO error");
		}
		
	}

}
