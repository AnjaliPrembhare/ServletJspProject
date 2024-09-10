package org.PetrolPump.Admin.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.PetrolPump.Admin.Model.MachineModel;
import org.PetrolPump.Admin.Service.MachineService;
import org.PetrolPump.Admin.Service.MachineServiceImpl;

@WebServlet("/updmachine")
public class UpdateMachineControlller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int mid=Integer.parseInt(request.getParameter("mid"));
		String machinecode=request.getParameter("mcode");
		RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
		r.include(request, response);
		out.println("<div class='col py-3'>");
		out.println("<form class='formarea' name='frm' action='finalmachineupdate' method='POST'>");
		out.println("<input type='hidden' name='mid' value='"+mid+"'/><br/><br/>");
		out.println("<input type='text' name='mcode' value='"+machinecode+"'/><br/><br/>");
		out.println("<input type='submit' name='s' value='Update Machine Code'/>");
		out.println("</div></div></div>");;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}










