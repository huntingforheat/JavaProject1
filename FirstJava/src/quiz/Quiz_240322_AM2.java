package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Quiz_240322_AM2 {

	public static void main(String[] args) {
		File file = new File("/Users/jungtae/Documents/filetest4/윤동주.txt");
		File dir = new File("/Users/jungtae/Documents/FileTest/testFile/temp");
		File dstFile = null;
		
		System.out.println("윤동주.txt는 파일인가요? " + file.isFile());
		System.out.println("dir이 존재하나요? " + dir.exists());
		
		FileReader input = null;
		FileWriter output = null;
		
		if(dir.exists()) {
			try {
				dstFile = new File(dir.getPath() + "/" + file.getName());
				input = new FileReader(file);
				output = new FileWriter(dstFile);
				
				char[] buffer = new char[512];
				
				int readCount = input.read(buffer);
				while (readCount != -1) {
					output.write(buffer, 0, readCount);
					readCount = input.read(buffer);
				}
				System.out.println("파일 복사 되었습니다");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					input.close();
					output.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			} else {
				System.out.println("디렉터리가 존재하지 않습니다.");
				dir.mkdirs();
				System.out.println("디렉터리 생성 성공");
				dstFile = new File(dir.getPath() + "/" + file.getName());
		}

	}

}
