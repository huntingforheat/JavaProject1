import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class I06_JDBC {

	
	
	public static void main(String[] args) {
		// JDBC 연동 테스트
		
		// 데이터베이스 연결 객체 (Connection 객체)
		Connection conn = null;
		
		// checkedException : SQLException
		try {
			// 1. 드라이버 로드
			// MySQL 사용 드라이버
			// MySQL 6.xx 버전 이전 : com.mysql.jdbc.Driver
			// MySQL 6.xx 버전 이후 : com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Connection 객체 생성 - DriverManager
			// MySQL 6.xx 미만인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름
			// MySQL 6.xx 이후인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름?serverTimezone=Asia/Seoul
			// 서울 UTC 값 : Asia/Seoul
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", 
					"root", 
					"******");
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공");
			
			// INSERT, UPDATE, DELETE - executeUpdate() - 반환 타입이 int
			// 3. Statement 객체 생성 createStatement()
			Statement stmt = conn.createStatement();
			
			// 4. SQL 작성
			String sql1 = "INSERT INTO Persons (firstname, lastname, age, city)"
					+ "VALUES('jdbcTest','testuser13', 24, 'Seoul')";
			String sql2 = "UPDATE persons SET firstname = '순신', lastname = '이' "
					+ "WHERE id = 27";
			String sql3 = "DELETE FROM persons WHERE id = 27";
			
			// 5. Statement 객체를 통해서 작성된 SQL을 실행
			int result = stmt.executeUpdate(sql3);
			// 성공시 : 1
			// 실패시 : 0
			if(result != 0) { // 1이 아닌 다른 숫자가 나올수 있기 때문에 == 1 이 아닌 != 0으로 설정해줌
				System.out.println("SQL 성공");
			} else {
				System.out.println("SQL 실패");
			}
			
			} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 오류");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
