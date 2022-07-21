import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedDemo {
	public static void main(String[] args) {
		String sql="insert into custom_table values(?,?,?)";
		Connection conn;
		try {
			conn = JdbcFactory.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.executeUpdate();
			System.out.println("Record Inserted..:)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Record Failed to Insert...:(");
			e.printStackTrace();
		}
	}
}