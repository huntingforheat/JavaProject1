package obj.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent {
	
	@Override
	public void doIt() throws SQLException { // 부모가 throws하지 않은 Exception은 throws 할 수 없다. 부모는 IOException을 하고 자식은 SQLException을 해서 빨간줄이 나옴.
		System.out.println("Child.doIt");
		try {                            
			 super.doIt();
		} catch (IOException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
