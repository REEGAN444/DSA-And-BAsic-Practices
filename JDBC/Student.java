package JJJ;
import java.sql.*;
import java.util.Scanner;
public class Student {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner s=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String un,up,url;
		url="jdbc:mysql://localhost:3306/reegan";
		un="root";
		up="//oppoA11K";
		
		Connection con=DriverManager.getConnection(url,un,up);
		
		
		
		System.out.print("Enter the Name:");
		String name=s.next();
		System.out.print("Enter the MArk1:");
		int m1=s.nextInt();
		System.out.print("ENter the Mark2:");
		int m2=s.nextInt();
		System.out.print("Enter the Mark3:");
		int m3=s.nextInt();
		int total=m1+m2+m3;
		double avg=total/3;
		
		String k="insert into jdbc values(?,?,?,?,?,?)";
		PreparedStatement pps=con.prepareStatement(k);
		pps.setString(1, name);
		pps.setInt(2, m1);
		pps.setInt(3,m2);
		pps.setInt(4, m3);
		pps.setInt(5, total);
		pps.setDouble(6, avg);
		
		int insertCount=pps.executeUpdate();
		for(int i=1;i<=insertCount;i++)
		{
			System.out.println("Line "+i+" inserted Successfully");
		}
		
		
		Statement stm=con.createStatement();
		String query="select * from jdbc";
		ResultSet rs=stm.executeQuery(query);
		ResultSetMetaData rd=rs.getMetaData();
		int c=rd.getColumnCount();
		System.out.println();
		
		System.out.println();
		int j=1;
		while(rs.next())
		{
			String name1=rs.getString(1);
			int m11=rs.getInt(2);
			int m21=rs.getInt(3);
			int m31=rs.getInt(4);
			int total1=rs.getInt(5);
			double avg1=rs.getDouble(6);
			System.out.println("----------------------Student "+j+"----------------------");
			System.out.print("Name:"+name1+"\nMark1:"+m11+"\nMark2:"+m21+"\nMark3:"+m31+"\nTotal:"+total1+"\nAverage:"+avg1);
			System.out.println();
			System.out.println("-------------------------------------------------------------");
			j++;
		}
		
	}

}
