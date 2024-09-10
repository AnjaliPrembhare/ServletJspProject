package org.PetrolPump.Admin.Service;
import java.util.List;

import org.PetrolPump.Admin.Model.EmployeeModel;
import org.PetrolPump.Admin.Repository.*;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository empRepo=new EmployeeRepositoryImpl();
	@Override
	public boolean isAddNewEmployee(EmployeeModel model) {	
		return empRepo.isAddNewEmployee(model);
	}
	@Override
	public List<EmployeeModel> getAllEmployee() {
         return empRepo.getAllEmployee();
	}

}
