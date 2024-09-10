package org.PetrolPump.Admin.Controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.PetrolPump.Admin.Model.FuelModel;
import org.PetrolPump.Admin.Service.FuelServiceImpl;
import org.PetrolPump.Admin.Service.FuelService;
import org.apache.tomcat.util.log.UserDataHelper.Mode;

@WebServlet("/fueltype")
public class FuelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fueltype=request.getParameter("type");
		FuelModel model=new FuelModel();
		model.setName(fueltype);
		FuelService fService=new FuelServiceImpl();
		boolean b=fService.isAddFuelModel(model);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			r.include(request, response);
			out.println("<center>Fuel type added successfully.......</center>");
		}
		else
		{
			RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
			r.include(request, response);
			out.println("<center>Some problem is there.........</center>");
		}	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
