package org.PetrolPump.Admin.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import org.PetrolPump.Admin.Service.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllocateMachine")
public class AllocateMachineToEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
		r.include(request, response);
		MachineService mService=new MachineServiceImpl();
		List<Object[]>list=mService.getAllMachine();
		out.println("<div class='col py-3'>");
		out.println("<form class='formarea' name='frm' action='finalmachineupdate' method='POST'>");
		out.println("<select name='mid' class='control' /><br/><br/>");
		out.println("<option>Select Machine</option>");
		for(Object obj[]:list) {
			out.println("<option>");
			out.println(obj[0]);
			out.println("</option>");
		}
		out.println("/select");
		out.println("<input type='text' name='mcode'class='control' value=''/><br/><br/>");
		out.println("<input type='submit' name='s' value='Update Machine Code'/>");
		out.println("</div></div></div>");;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
