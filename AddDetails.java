package Com.Sample_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.JDBC_connect.JDBC_Connector;
import Com.Sample.CustomerDetails;


@WebServlet("/addDetails")
public class AddDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddDetails() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String mobile_no=request.getParameter("mobile_no");
		String email_id=request.getParameter("email_id");
		String Registration_Number=request.getParameter("Registration_Number");
		String Vehicle_type=request.getParameter("Vehicle_type");
		String Make=request.getParameter("Make");
		String Modal=request.getParameter("Modal");
		String tenure=request.getParameter("tenure");
		String price=request.getParameter("price");
		
		PrintWriter out=response.getWriter();
		
		
		
	Connection con =JDBC_Connector.getConnection();
	if(null!=con) {
		try {
			Statement st= con.createStatement();
		String insertQuery ="insert into customers_details(Cus_name,Address,Mobile_no,Email_id,Registration_Number,vehicle_type,Make,Modal,Tenure,price)"+"values('"+name+"','"+address+"',"+mobile_no+",'"+email_id+"','"+Registration_Number+"','"+Vehicle_type+"','"+Make+"','"+Modal+"',"+tenure+",'"+price+"')";
		 System.out.println(insertQuery);
		st.execute(insertQuery);
		String selectquery="select * from customers_details";
		ResultSet rs=st.executeQuery(selectquery);
		List<CustomerDetails> cusList=new ArrayList<>();
		while(rs.next()) {
		CustomerDetails cus=new CustomerDetails(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getLong(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11));
		cusList.add(cus);
		}
		request.setAttribute("cusDetails", cusList);
		
	RequestDispatcher rd=request.getRequestDispatcher("DetailsForm.jsp");
	rd.forward(request,response);
	
	con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

}
