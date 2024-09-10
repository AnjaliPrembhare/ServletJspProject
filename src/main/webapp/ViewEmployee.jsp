<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="org.PetrolPump.Admin.Service.*,org.PetrolPump.Admin.Model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!MachineService machineservice = new MachineServiceImpl();%>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3">
		<br />
		<br />
		<br />
		<br />
		<h2>Employee Details</h2><br/>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Sr.No</th>
					<th scope="col">Employee Name</th>
					<th scope="col">Contact</th>
					<th scope="col">Allocate Machine</th>
					<th scope="col">Delete</th>
					<th scope="col">Update</th>
				</tr>
			</thead>
			<tbody>
				<%
				  EmployeeService empService=new EmployeeServiceImpl();
				  List<EmployeeModel> list=empService.getAllEmployee();
				  int count=0;
				  for(EmployeeModel eModel:list){
				%>
				  <tr>
				      <td><%=++count%></td>
				      <td><%=eModel.getName()%></td>
				      <td><%=eModel.getContact()%></td>
				      <td><a href='AllocateMachine?empid=<%=eModel.getId()%>'>Allocate Machine</a></td>
				      <td><a href=''>DELETE</a></td>
				      <td><a href=''>UPDATE</a></td>
				  </tr>
				<%
				  }
				%>
			</tbody>
		</table>
	</div>
	</div>
	</div>
</body>
</html>