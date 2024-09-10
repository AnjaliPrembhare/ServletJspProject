package org.PetrolPump.Admin.Controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.PetrolPump.Admin.Model.EmployeeModel;
import org.PetrolPump.Admin.Service.*;

@WebServlet("/addemployee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		int sal=Integer.parseInt(request.getParameter("sal"));
		EmployeeModel empModel=new EmployeeModel();
		empModel.setName(name);
		empModel.setEmail(email);
		empModel.setContact(contact);
		empModel.setAddress(address);
		empModel.setSal(sal);
		EmployeeService empService=new EmployeeServiceImpl();
		boolean b=empService.isAddNewEmployee(empModel);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			r.include(request, response);
			out.println("<h2><center>Employee Added Successfully........</center></h2>");		
		}
		else
		{
			RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			r.include(request, response);
			out.println("<h2><center>Employee Not Added........</center></h2>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}













