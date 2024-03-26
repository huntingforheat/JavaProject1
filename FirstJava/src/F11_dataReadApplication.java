import java.io.DataInputStream;
import java.io.FileInputStream;

public class F11_dataReadApplication {

	public static void main(String[] args) {
		// DataRead
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("customer.data");
			dis = new DataInputStream(fis);
			String name  = null; // 네임이 null 값이면 더이상 볼 필요가 없기 때문에 name = null 로 선언
			while((name = dis.readUTF()) != null) {
				System.out.println(name);
				System.out.println(dis.readChar()); // 캐스팅 없이 형변환 가능
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch (Exception e2) {}
		}

	}

}
