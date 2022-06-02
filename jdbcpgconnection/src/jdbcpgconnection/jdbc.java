package jdbcpgconnection;
import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","Lokesh123");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM employee");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		System.out.println("Students Table Created Successfully");
		
		System.out.println("Row inserted successfully");
		st.close();

	}

}
