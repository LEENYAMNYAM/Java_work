package streamPro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fin;
		FileOutputStream fout;
		byte[] buf = new byte[100];
		
		try {
			fin = new FileInputStream("d:/JMT/JAVA/workspace/abc.jpg");
			fout = new FileOutputStream("d:/JMT/JAVA/workspace/abc2.jpg");
			int c;
			while((c=fin.read(buf)) != -1) {
				fout.write(buf, 0, c);   // 100개의 배열에서 다 읽고 배열이 더 남았을때 앞에 저장된 값이 출력되는것을 막아줌.
			}
			fin.close();
			
		}catch(IOException ex) {
			System.out.println("IO error");
		}
		
		
	}

}
