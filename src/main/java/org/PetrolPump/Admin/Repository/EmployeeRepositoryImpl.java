package org.PetrolPump.Admin.Repository;
import java.util.*;
import org.PetrolPump.Admin.Config.DBConfig;
import org.PetrolPump.Admin.Model.EmployeeModel;

public class EmployeeRepositoryImpl extends DBConfig implements EmployeeRepository {
	List<EmployeeModel> list=new ArrayList<EmployeeModel>();
    int empId=0;
	public int getEmployeeId() {
		try
		{
			stmt=conn.prepareStatement("select max(eid) from employee");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				empId=rs.getInt(1);
			}
			return ++empId;
		}
		catch(Exception ex)
		{
			return -1;
		}
	}
	@Override
	public boolean isAddNewEmployee(EmployeeModel model) {
		try
		{
			int employeeId=this.getEmployeeId();
			stmt=conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			stmt.setInt(1, employeeId);
			stmt.setString(2, model.getName());
			stmt.setString(3, model.getEmail());
			stmt.setString(4, model.getContact());
			stmt.setString(5, model.getAddress());
			stmt.setInt(6, model.getSal());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error in employeeRepo is "+ex);
			return false;
		}
	}
	@Override
	public List<EmployeeModel> getAllEmployee() {
		try
		{
			stmt=conn.prepareStatement("select * from employee");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				EmployeeModel emp=new EmployeeModel();
				emp.setId(rs.getInt("Eid"));
				emp.setName(rs.getString("Name"));
				emp.setEmail(rs.getString("Email"));
				emp.setContact(rs.getString("Contact"));
				emp.setSal(rs.getInt("Salary"));
				emp.setAddress(rs.getString("Address"));
				list.add(emp);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}
    
}


















