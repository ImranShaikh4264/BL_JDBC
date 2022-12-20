import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class EmployeeTest {

	public static void main(String[] args) {
		Connection con = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Payroll","root","987654");
		Statement st = con.createStatement();
		String query = "select * from emp";
		ResultSet res = st.executeQuery(query);
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4)+" "+res.getInt(5));
		
		}
	}
	catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}

}
