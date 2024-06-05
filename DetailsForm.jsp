
<%@page import="Com.Sample.CustomerDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Motor Insurance Policy</title>

<style type="text/css">

body{

background-color:rgb(202, 198, 198);
}

table,th,td{
    border: 2px solid black;
    border-collapse: collapse;
    text-align: center;
   padding:9px;
   margin:20px;
   color:black;
   font-weight: bold;
}
th{
 color:Red;
 background-color:pink;
 z-index:+2;
}

</style>
</head>
<body>


<%

List <CustomerDetails> cusList = (List<CustomerDetails>) request.getAttribute("cusDetails");

%>
<table>
		<tr>
		<h1></h1>
			<th>Serial_No</th>
			<th>Name</th>
			<th>Address</th>
			<th>Mobile_no</th>
			<th>Email_id</th>
			<th>Registration_Number</th>
			<th>Vehicle_type</th>
			<th>Make</th>
			<th>Modal</th>
            <th>Tenure</th>
            <th>Price</th>
			
		</tr>
		<%
		for (int i = 0; i < cusList.size(); i++) {
		%>
		<tr>
			<td><%=cusList.get(i).getId()%></td>
			<td><%=cusList.get(i).getName()%></td>
			<td><%=cusList.get(i).getAddress()%></td>
			<td><%=cusList.get(i).getMobile_no()%></td>
			<td><%=cusList.get(i).getEmail_id()%></td>
			<td><%=cusList.get(i).getRegistration_Number() %></td>
			<td><%=cusList.get(i).getVehicle_type()%></td>
			<td><%=cusList.get(i).getMake()%></td>
			<td><%=cusList.get(i).getModal()%></td>
			<td><%=cusList.get(i).getTenure()%></td>
		    <td><%=cusList.get(i).getPrice()%></td>
		</tr>
		<%
		}
		%>
	</table>



</body>
</html>

