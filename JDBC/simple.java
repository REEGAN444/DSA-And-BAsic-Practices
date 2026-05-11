package JJJ;
import java.sql.*;


public class simple {
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String un="root";
		String up="//oppoA11K";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reegan",un,up);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from student");
		ResultSetMetaData rd=rs.getMetaData();
		int c=rd.getColumnCount();
		for(int i=1;i<=c;i++)
		{
			System.out.print(rd.getColumnName(i)+" ");
		}
		System.out.println();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"        "+rs.getInt(2)+"            "+rs.getString(3));
		}
		
		
	}

}
;