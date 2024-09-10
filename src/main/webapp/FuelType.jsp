<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="AdminDashboard.jsp"%>
	<div class="col py-3">
		<form class="formarea" name="frm" action="fueltype" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Fuel Type</label><br/><br/> 
				<input type="text" class="form-control control" name="type" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Fuel Type" ><br/>
			<button type="submit" class="btn btn-primary">Add New Fuel Type</button>
			</div><br/>
		</form>
	</div>
	</div>
	</div>
</body>
</html>