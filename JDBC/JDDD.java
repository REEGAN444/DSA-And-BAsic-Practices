package JJJ;
import java.sql.*;

public class JDDD {
	public static void main(String args[]) throws Exception
	{
		Connection con=null;
		Statement s=null;
		ResultSet rs=null;
		
		int f=0;
		Class.forName("com.mysql.cj.jdbc.Driver");			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reegan","root","//oppoA11K");
		s=con.createStatement();
		rs=s.executeQuery("select * from login");
		
		while(rs.next())
		{
			
		System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
	}
}
