import java.io.File;
import java.io.FileWriter;

public class F04_fileWriterEx {

	public static void main(String[] args) {
		
		File file = new File("/Users/jungtae/Documents/FileTest/wr.txt");
		
		FileWriter out = null;
		
		try {
			// FileWriter 객체 생성
			out = new FileWriter(file, false); // append가 false이면 추가 x, true이면 추가 o
			// 작업 진행						   // false는 밑에 나와있는 문장들만 출력해줌 true일 경우는 밑에 문장들이 계속 추가 됨.
			out.write("테스트를 위한 메시지!@!!!\n");
			out.write("테스트를 위한 메시지2....\n");       // write를 써도되고 append를 써도 됨.
			out.append("테스트를 위한 메시지3....\n");
			out.append("테스트를 위한 메시지4....\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e3) {}
		}

	}

}
