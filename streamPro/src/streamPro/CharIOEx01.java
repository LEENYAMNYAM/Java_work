package streamPro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fin;
		FileOutputStream fout;
		byte[] buf = new byte[1024];
		
		try {
			fin = new FileInputStream("C:\\Windows\\system.ini");
			fout = new FileOutputStream("d:/JMT/JAVA/workspace/system.txt");
			int c;
			while((c=fin.read(buf)) != -1) {
				fout.write(buf, 0, c); 
			}
			fin.close();
			fout.close();
		}catch(IOException ex) {
			System.out.println("IO error");
		}
		
//		또는 -----------------------------------------------------
		
		char[] cbuf = new char[1024];
		try (FileReader fr = new FileReader("C:/windows/system.ini");
	         FileWriter fw = new FileWriter("C:/pgm/system.txt")) {
	            int c;
	            while ((c = fr.read(cbuf)) != -1) {
	                fw.write(cbuf, 0, c);
	            }
	            fr.close();
	            fw.close();
	        } catch (IOException e) {
	            System.out.println("IO Error: " + e.getMessage());
	        }
		
		
		
		
	}

}
