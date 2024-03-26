import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class F02_fileInputStreamEx1 {

	public static void main(String[] args) {
		
		InputStream fis = null;
		
		try {
			//FileInputStream(파일 읽을 경로)
			File file = new File("/Users/jungtae/Documents/FileTest/test.txt");
			fis = new FileInputStream(file);
			
			// 버퍼 공간
			byte[] buffer = new byte[100];
			String content = "";
			// 데이터 읽기
//			while(true) {
//				int data = fis.read(buffer); // 버퍼 공간이 있는 경우 - 주어진 버퍼에 데이터를 담아서 처리, 캐릭터 단위로 처리, 반환값 데이터 길이
////				int data = fis.read();		 // 버퍼 공간이 없는 경우 - 1바이트씩 읽기, read() 반환값이 저장된 값을 반환
////				System.out.println((char)data);	 // read()는 1바이트 단위로 읽고 있음 char는 2바이트 처리하는 바이트가 맞지 않기 때문에 문자열을 출력할떄는 버퍼 공간을 줘야한다.
//				System.out.println(data);
//				// 데이터 읽기가 끝날 때 -1인 경우
////				if (data != -1) content = new String(buffer, 0, data); // 진행
////				else break; // 끝
////				System.out.println(content);
//				if (data == -1) break;
//			}
	
		// 다른 방식으로 읽기
		int readCount = fis.read(buffer); // 처음 블럭 읽기
		while (readCount != -1) {
			String data = new String(buffer, 0, readCount); // 데이터 처리
			System.out.println(data);
			readCount = fis.read(buffer); // 다음 블럭 읽기
			}
			
		} catch (FileNotFoundException fe) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally { // 객체 정리
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			

			
		}

	}

}
