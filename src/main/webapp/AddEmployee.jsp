<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.PetrolPump.Admin.Service.*,org.PetrolPump.Admin.Model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.farea
{
	position:absolute;
	margin-left:25vw;
	margin-top:5vh;
	border:1px solid;
	padding:10px;
}
   
</style>
</head>
<body>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3">
	<h2><center>Employee Form</center></h2>
		<form class="farea" name="frm" action="addemployee" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1"><h6>Enter Name</h6></label><br/>
				<input type="text" class="form-control control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="ex.Ram" ><br/>
				<label for="exampleInputEmail1"><h6>Enter Email</h6></label><br/> 
				<input type="text" class="form-control control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="ex.ram@gmail.com" ><br/>
				<label for="exampleInputEmail1"><h6>Enter Contact</h6></label><br/>
				<input type="text" class="form-control control" name="contact" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="ex.9122332233" ><br/>
				<label for="exampleInputEmail1"><h6>Enter Address</h6></label><br/> 
				<input type="text" class="form-control control" name="address" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="ex.pune" ><br/>
				<label for="exampleInputEmail1"><h6>Enter Salary</h6></label><br/>
				<input type="text" class="form-control control" name="sal" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="ex.10000" ><br/>
			<button type="submit" class="btn btn-primary">Add New Employee</button>
			</div>
		</form>
	</div>
	</div>
	</div>
</body>
</html>