package streamPro;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fin;
		try {
			fin = new FileInputStream("d:/JMT/JAVA/workspace/test5.out");
			int c;
			while((c=fin.read()) != -1) {
				System.out.println((char)c);
			}
			
		}catch(IOException ex) {
			System.out.println("파일 입출력 오류");
		}
		
	}

}
