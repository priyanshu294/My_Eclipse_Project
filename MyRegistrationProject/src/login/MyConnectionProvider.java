package login;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {
	
	static Connection con = null;
	
	public static Connection getCon() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(connUrl, username, pass);
			
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return con;
		
	}

}
