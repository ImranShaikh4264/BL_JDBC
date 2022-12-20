import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeOperations {

	public static void main(String[] args) {
	
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(201,"Karan","Agra",30000,24));
		list.add(new Employee(202,"Mahesh","Nagpur",25000,30));
		list.add(new Employee(203,"Riya","Mumbai",25000,22));
		
		Connection con = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Payroll","root","987654");
	
		String query = "insert into emp(id,name,city,salary,age) values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			pst.setInt(1, emp.getId());
			pst.setString(2, emp.getName());
			pst.setString(3, emp.getCity());
			pst.setInt(4, emp.getSalary());
			pst.setInt(5, emp.getAge());
			pst.execute();
		}
		System.out.println("Data added successfully");
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
