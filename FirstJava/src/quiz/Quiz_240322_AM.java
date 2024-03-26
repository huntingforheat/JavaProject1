package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * [사전 작업]
	1. 윤동주의 별을 헤는 밤을 텍스트로 만들어서 "윤동주.txt"로 저장
	2. D:\filetest4 디렉터리를 생성한 후에 "윤동주.txt"를 저장

   [작업]
	1) 윤동주.txt 가 존재 및 파일, 디렉터리 여부를 확인
	2) FileTest/testFile/temp 디렉터리로 파일을 이동. 없으면 만들어서 이동
	3) 복사된 위치에서 "윤동주.txt"을 읽어서 화면에 console를 띄워 주세요!!
 */

public class Quiz_240322_AM {
	
	static String env_path = "/Users/jungtae/miniforge3/bin /Users/jungtae/miniforge3/condabin /opt/homebrew/bin /opt/homebrew/sbin /Library/Frameworks/Python.framework/Versions/3.11/bin /usr/local/bin /System/Cryptexes/App/usr/bin /usr/bin /bin /usr/sbin /sbin /var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/local/bin /var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/bin /var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/appleinternal/bin /opt/X11/bin /Library/Apple/usr/bin /Applications/VMware Fusion.app/Contents/Public /usr/local/share/dotnet ~/.dotnet/tools /Library/Frameworks/Mono.framework/Versions/Current/Commands";

	public static void main(String[] args) {
		
//		File f = new File("/Users/jungtae/Documents/filetest4/윤동주.txt");
//		File dir = new File("./");
//		
//		
//		
//		// 파일 및 디렉터리 여부 확인
//		System.out.println("파일 존재? : " + f.exists());
//		System.out.println("디렉터리 존재? : " + dir.exists());
//		System.out.println("파일 디렉터리? : " + f.isDirectory());
//		System.out.println("디렉터리 여부? : " + dir.isDirectory());
//		
//		// 환경 변수
//		String[] path = env_path.split(File.pathSeparator);
//		
//		for(String p : path) {
//			System.out.println(p);
//		}
//		
//		// 파일 이동
//		File test = new File("/Users/jungtae/Documents/filetest4");
//		
//		if(!test.exists()) {
//			test.mkdirs();
//		}
//		test = new File("/Users/jungtae/Documents/FileTest/testFile/temp");
//		try {
//			test.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("파일 생성중 에러 발생");
//		}
//		
//		// 경로 변경
//		test = new File("/Users/jungtae/Documents/filetest4/윤동주.txt");
//		File dst = new File("/Users/jungtae/Documents/FileTest/testFile/temp/윤동주.txt");
//		test.renameTo(dst);
//
//		// 콘솔 띄우기
//		
//		File filef = new File("/Users/jungtae/Documents/FileTest/testFile/temp/윤동주.txt");
//		FileReader in = null;
//		
//		char[] cbuf = new char[100];
//		try {
//			in = new FileReader(filef);
//			String content = "";
//			while (true) {
//				int data = in.read(cbuf);
//				System.out.println(data);
//				if (data != -1) content  = new String(cbuf, 0, data);
//				else break;
//				System.out.println(content);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try { in.close(); } catch (Exception e) {}
//		}
		
		File file = new File("/Users/jungtae/Documents/filetest4/윤동주.txt");
		File dir = new File("/Users/jungtae/Documents/FileTest/testFile/temp");
		File dstFile = null;
		
		System.out.println("윤동주.txt는 파일인가요? " + file.isFile());
		System.out.println("dir이 존재하나요? " + dir.exists());
		if(dir.exists()) {
			dstFile = new File(dir.getPath() + "/" + file.getName());
			file.renameTo(dstFile);
		} else {
			System.out.println("디렉터리가 존재하지 않습니다.");
			dir.mkdirs();
			System.out.println("디렉터리 생성 성공");
			dstFile = new File(dir.getPath() + "/" + file.getName());
			file.renameTo(dstFile);
		}
		System.out.println(dstFile);
		
		Reader rFile = null;
		try {
			rFile = new FileReader(dstFile);
			while(true) {
				int data = rFile.read();
				System.out.print((char)data);
				if(data == -1) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rFile.close();
			} catch (Exception e2) {}
		}
	}
	
}
