import java.sql.Connection;
import java.sql.DatabaseMetaData;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/saidb";
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection(url, "root", "Saikd@1919");
			System.out.println("connection successful");
			
			DatabaseMetaData meta= conn.getMetaData();
			System.out.println("DB Name :"+ meta.getDatabaseProductName());
			System.out.println("DB Ver:" +meta.getDatabaseProductVersion());
			System.out.println("Driver Name:" +meta.getDriverName());
			System.out.println("Driver Name:" +meta.getDriverVersion());
		}
		 catch (SQLException e) {
			 System.out.println( "connection failed");
			 e.printStackTrace();
		 }
	}
}