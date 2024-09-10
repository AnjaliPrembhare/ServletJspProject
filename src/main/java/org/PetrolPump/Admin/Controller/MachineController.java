package org.PetrolPump.Admin.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.PetrolPump.Admin.Model.MachineModel;
import org.PetrolPump.Admin.Service.MachineService;
import org.PetrolPump.Admin.Service.MachineServiceImpl;

@WebServlet("/newmachine")
public class MachineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MachineService machineservice = new MachineServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String machinecode = request.getParameter("machinecode");
		String ftypeId[] = request.getParameterValues("ftype");
		String capArray[] = request.getParameterValues("capacity");
		MachineModel model = new MachineModel();
		model.setMachinecode(machinecode);
		boolean flag = false;
		boolean b = machineservice.isAddNewMachine(model,ftypeId,capArray);
		if (b) {
			out.println("<h1>Machine added successfully........</h1>");
		}
		else {
			out.println("<h1>Machine not added.........</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
