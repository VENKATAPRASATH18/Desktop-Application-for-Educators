package source;


import java.sql.*;


public class DBconnect {
	public static Connection connect;

	public static  Connection EstablishConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connect =  (Connection) DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
		} catch (Exception e) {

			System.out.println(e);

		}
		return connect;
	}

	
	}


