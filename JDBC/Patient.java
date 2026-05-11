package JJJ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Patient {
	
	static String un="root";
	static String up="//oppoA11K";
	static ResultSetMetaData rd;
	static ResultSet rs;
	static Statement st;
	static Connection con;
	static Scanner s=new Scanner(System.in);
	Patient() throws SQLException
	{
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reegan",un,up);
		st=con.createStatement();
		rs=st.executeQuery("Select * from patient");
		rd=rs.getMetaData();
		
	}
	
	
	static void Printall() throws SQLException
	{
		
		int c=rd.getColumnCount();
		System.out.print("----------------------------------------------------------------"+"\n|   ");
		for(int i=1;i<=c;i++)
		{
			System.out.print(rd.getColumnName(i)+"   |   ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		
		while(rs.next())
		{
			System.out.println("|   "+rs.getString(1)+"   |   "+rs.getInt(2)+"   |   "+rs.getString(3)+"   |   "+rs.getInt(4)+"   |   ");
		}
	}
	
	static void insert() throws SQLException
	{
		
		System.out.print("Enter Patient name:");
		String name=s.next();
		name=name.toLowerCase();
		System.out.print("Enter Patient Age:");
		int age=s.nextInt();
		System.out.print("Enter Disease Name:");
		String disease=s.next();
		System.out.print("Enter Room Number:");
		int roomno=s.nextInt();
		
	
		String k="insert into patient values(?,?,?,?)";
		PreparedStatement pps=con.prepareStatement(k);
		pps.setString(1, name);
		pps.setInt(2, age);
		pps.setString(3,disease);
		pps.setInt(4, roomno);
		pps.executeUpdate();
		
		System.out.println("Line Updated");
	}
	
	
	static void searchByName() throws SQLException
	{
		System.out.print("Enter Name:");
		String name=s.next().toLowerCase();
		String k="Select * from patient where name=?";
		PreparedStatement pps=con.prepareStatement(k);
		pps.setString(1, name);
		rs=pps.executeQuery();
		
		ResultSetMetaData rd=rs.getMetaData();
		int c=rd.getColumnCount();
		System.out.println();
		
		System.out.println();
		int j=1;
		while(rs.next())
		{
			String name1=rs.getString(1);
			int age1=rs.getInt(2);
			String disease1=rs.getString(3);
			int roomno1=rs.getInt(4);
			
			
			System.out.println("----------------------------------Name----------------------------------");
			System.out.print("Name:"+name1+"\nAge:"+age1+"\nDisease:"+disease1+"\nRoom Number:"+roomno1);
			System.out.println();
			
			j++;
		}
		
		
		
		
	}
	
	static void disease() throws SQLException
	{
		System.out.print("Enter Disease Name:");
		String name=s.next().toLowerCase();
		String k="Select * from patient where disease=?";
		PreparedStatement pps=con.prepareStatement(k);
		pps.setString(1, name);
		rs=pps.executeQuery();
		
		ResultSetMetaData rd=rs.getMetaData();
		int c=rd.getColumnCount();
		System.out.println();
		
		System.out.println();
		int j=1;
		int count=0;
		while(rs.next())
		{
			String name1=rs.getString(1);
			int age1=rs.getInt(2);
			String disease1=rs.getString(3);
			int roomno1=rs.getInt(4);
			
			
			System.out.println("---------------------------------Search By Name----------------------------------");
			System.out.print("Name:"+name1+"\nAge:"+age1+"\nDisease:"+disease1+"\nRoom Number:"+roomno1);
			System.out.println();
			count++;
			j++;
		}
		
		
		System.out.println("Total Count:"+count);
	}
	
	
	
	public static void main(String args[]) throws Exception
	{
		Patient p=new Patient();
		int flag=1;
		while(flag!=0)
		{
			System.out.println("1.Print\n2.insert\n3.Search By Name\n4.Serch By Disease\n5.exit\nEnter Here:");
			int n=s.nextInt();
			
			switch(n)
			{
			case 1:
				p.Printall();
				break;
			case 2:
				p.insert();
				break;
			case 3:
				p.searchByName();
				break;
			case 4:
				p.disease();
				break;
			case 5:
				flag=0;
				break;
			
			}
			
			System.out.println("-------------------------------------------------------------------------------------");
		}
		
	}
}
