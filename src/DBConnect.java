import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			//register driver
			Class.forName("com.mysql.jdbc.Driver");
			//connection creation
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root");
			//statement creation
			Statement stmt = con.createStatement();
			//query execution
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"----------"+rs.getString("name"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//close connection
			con.close();
		}

	}

}
