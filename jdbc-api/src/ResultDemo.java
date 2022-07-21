import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ResultDemo {

	public static void main(String[] args) {
		String sql = "select * from person";
		
		try {
			 Connection conn = JdbcFactory.getConnection();
		     Statement stmt = conn.createStatement();
		     ResultSet rs = stmt.executeQuery(sql);
		     
		     ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
		     for(int c= 1; c<= meta.getColumnCount();c++)
		    	 System.out.println(meta.getColumnName(c) +"\t");
		     System.out.println();
		     
		
		      while(rs.next())
			      System.out.println(rs.getString(1)+"\t"+rs.getInt("age")+"\t"+rs.getString(3));
		}catch (SQLException e) {
			System.out.println("result not");
			e.printStackTrace();
		}
	}

}