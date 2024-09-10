package org.PetrolPump.Admin.Repository;
import java.util.*;
import org.PetrolPump.Admin.Config.DBConfig;
import org.PetrolPump.Admin.Model.FuelModel;

public class FuelRepositoryImpl extends DBConfig implements FuelRepository {
    List<FuelModel> list=new ArrayList<FuelModel>();
	@Override
	public boolean isAddFuelType(FuelModel model) {
		try
		{
			stmt=conn.prepareStatement("insert into fueltype values('0',?)");
			stmt.setString(1, model.getName());
			return stmt.executeUpdate()>0?true:false;
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public List<FuelModel> getAllFuelTypes() {
		try
		{
			stmt=conn.prepareStatement("select * from fueltype");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				FuelModel model=new FuelModel();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				list.add(model);
				
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			return null;
		}	
	}
}
