//zdroj: https://examples.javacodegeeks.com/core-java/java-postgresql-example/

package databaza;

import java.sql.*;

public class DBCOnnection {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection(
					DBContract.HOST+DBContract.DB_NAME,
					DBContract.USERNAME,
					DBContract.PASSWORD);
			System.out.println("DB connected");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
}
