<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.PetrolPump.Admin.Service.*,org.PetrolPump.Admin.Model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3">
		<form class="formarea" name="frm" action="newmachine" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Machine Code</label><br />
				<br/> <input type="text" class="form-control control"
					name="machinecode" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter Machine Code">
				<br/>
				<table>
				  <%
				     FuelService fService=new FuelServiceImpl();
					 List<FuelModel> list=fService.getAllFuelTypes();
					 for(FuelModel m:list)
					 {
				  %>
				   <tr>
				     <td><input type='checkbox' name='ftype' value='<%=m.getId()%>'/>&nbsp;&nbsp;<%=m.getName()%></td>
				     <td><input type='text' name='capacity' value=''/></td>
				   </tr>
				  <%
					 }
				  %>
				</table><br/>
				<button type="submit" class="btn btn-primary">Add New Machine</button>
			</div>
			<br />
		</form>
	</div>
	</div>
	</div>
</body>
</html>