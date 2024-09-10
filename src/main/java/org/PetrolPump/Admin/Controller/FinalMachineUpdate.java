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

@WebServlet("/finalmachineupdate")
public class FinalMachineUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
			int mid=Integer.parseInt(request.getParameter("mid"));
			String machinecode=request.getParameter("mcode");
			MachineModel model=new MachineModel();
			model.setId(mid);
			model.setMachinecode(machinecode);
			MachineService mService=new MachineServiceImpl();
			boolean b=mService.isUpdateMachine(model);
			if(b)
			{
				RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
				r.forward(request, response);
			}
			else
			{
				out.println("<h1>Machine Data Not Updated</h1>");
			}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
