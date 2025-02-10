package filetest;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f0 = new File("d:/JMT/JAVA/workspace");
		File f1 = new File("d:/JMT/JAVA/workspace/test.txt");
		File f2 = new File("d:/JMT/JAVA/workspace", "abc.jpg");				// 디렉토리 경로와 파일명을 따로 적어도 됨
		File f3 = new File(f0, "abc.jpg");
		
		System.out.println("파일크기 : " + f1.length());
		System.out.println("파일명 : " + f1.getName());
		System.out.println("경로 : " + f1.getPath());
		System.out.println("부모경로" + f1.getParent());
		System.out.println("파일여부 : " + f1.isFile());
		System.out.println("디렉토리여부 : " + f1.isDirectory());
		
		System.out.println("파일크기 : " + f0.length());
		System.out.println("파일명 : " + f0.getName());
		System.out.println("경로 : " + f0.getPath());
		System.out.println("부모경로" + f0.getParent());
		System.out.println("파일여부 : " + f0.isFile());
		System.out.println("디렉토리여부 : " + f0.isDirectory());
		System.out.println("-----------------------------------------------------------");
		
		File[] subFiles = f0.listFiles();
		
		for(int i = 0; i < subFiles.length; i++) {
			System.out.print("파일이름 : " + subFiles[i].getName()+ "\t");
			if(subFiles[i].isFile())
				System.out.println("파일크기 : " + subFiles[i].length());
			else
				System.out.println();
		}
		
	}

}
