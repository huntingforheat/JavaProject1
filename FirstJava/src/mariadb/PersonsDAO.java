package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {
	
	String url = "jdbc:mariadb://localhost:13306/testdb";
	String user = "root";
	String password = "p05120220";
	
	// DB 연동을 위한 객체 선언
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PersonsDAO() {
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	public PersonsDAO(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	// insert
	public int insertPersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "insert into Persons (lastname, firstname, age, city)"
				+ "VALUES('"+vo.getLastname()+"','"+vo.getFirstname()+"'" +"," +vo.getAge()+" , '"+vo.getCity()+"')";
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 에러");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// selectAll
	
	public List<PersonsVO> selectAll() {
		List<PersonsVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM persons";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				PersonsVO vo = new PersonsVO(id, firstName, lastName, age, city);
				list.add(vo);
			}
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		return list;
	}
	
	// selectOne
	
	public PersonsVO selectOne(int id) {
		PersonsVO vo = null;
		
		String sql = "SELECT * FROM persons WHERE id = " + id;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				vo = new PersonsVO();
				vo.setId(rs.getInt("id"));
				vo.setLastname(rs.getString("lastname"));
				vo.setFirstname(rs.getString("firstname"));
				vo.setAge(rs.getInt("age"));
				vo.setCity(rs.getString("city"));
			} else {
				System.out.println("찾는 DB가 없습니다.");
			}
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return vo;
	}
	
	// update
	
	public int updatePersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "update persons set firstname = '"+vo.getFirstname()+
				"', lastname = '"+vo.getLastname()+"', age = "+vo.getAge()+
				", city = '"+vo.getCity()+"' where id = "+vo.getId();
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// delete
	public int deletePersons(int id) {
		int result = 0;
		
		String sql = "DELETE FROM persons WHERE id = " + id;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
}
