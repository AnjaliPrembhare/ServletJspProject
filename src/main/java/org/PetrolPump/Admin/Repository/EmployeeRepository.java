package org.PetrolPump.Admin.Repository;
import org.PetrolPump.Admin.Model.EmployeeModel;
import java.util.*;

public interface EmployeeRepository {
	 public boolean isAddNewEmployee(EmployeeModel model);
	 public List<EmployeeModel> getAllEmployee();
}
