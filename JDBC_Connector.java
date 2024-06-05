package Com.JDBC_connect;

import java.sql.*;
import java.sql.Connection;

public class JDBC_Connector {
public static void main(String[] args) {
	try {
   String url="jdbc:mysql://localhost:3306/Advance_java_project";
   String userName="root";
   String password="Kathir@123";
   
   Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection(url,userName,password);
   Statement st=con.createStatement();
   
   String selectQuery="select * from customers_details";
   ResultSet rs=st.executeQuery(selectQuery);
   
   while(rs.next()) {
	   System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getLong(4)+""+rs.getString(5)+""+rs.getString(6)+""+rs.getString(7)+""+rs.getString(8)+""+""+rs.getString(9)+""+rs.getInt(10)+""+rs.getString(11));
   }
	con.close();	
	}catch(Exception e){
		e.printStackTrace();
	}
	}
public static Connection getConnection()  {
	Connection con=null;
	try {
		String url="jdbc:mysql://localhost:3306/Advance_java_project";
		   String userName="root";
		   String password="Kathir@123";
		   
		   Class.forName("com.mysql.jdbc.Driver");
		  con=DriverManager.getConnection(url,userName,password);
		   	
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}

}
