package org.PetrolPump.Admin.Service;
import java.util.*;
import org.PetrolPump.Admin.Model.EmployeeModel;

public interface EmployeeService {
	 public boolean isAddNewEmployee(EmployeeModel model);
	 public List<EmployeeModel> getAllEmployee();
}
