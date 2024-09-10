package org.PetrolPump.Admin.Repository;
import java.util.*;


import org.PetrolPump.Admin.Config.DBConfig;
import org.PetrolPump.Admin.Model.MachineModel;

public class MachineRepositoryImpl extends DBConfig implements MachineRepository {
    List<Object[]> list;
    int mid;
    public int getMachineAutomatic()
    {
    	try {
    		stmt=conn.prepareStatement("select max(mid) from machineinfo");
    		rs=stmt.executeQuery();
    		if(rs.next())
    		{
    			mid=rs.getInt(1);	
    		}
    		++mid;
    		return mid;
    	}
    	catch(Exception ex)
    	{
    		System.out.println("Error is "+ex);
    		return -1;
    	}
    }
	@Override
	public boolean isAddNewMachine(MachineModel model,String typeid[],String []capacity) {
		try
		{
			mid=this.getMachineAutomatic();
			//String machinecode=model.getMachinecode();
			stmt=conn.prepareStatement("insert into machineinfo values(?,?)");
			stmt.setInt(1, mid);
			stmt.setString(2, model.getMachinecode());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				for(int i=0;i<capacity.length;i++) {
					if(capacity[i]!=null)
					{
						stmt=conn.prepareStatement("insert into machinetypejoin values(?,?,?)");
						stmt.setInt(1, mid);
						stmt.setInt(2, Integer.parseInt(typeid[i]));
						stmt.setInt(3,Integer.parseInt(capacity[i]));
						value=stmt.executeUpdate();
					}
				}
				return value>0?true:false;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}
	
	@Override
	public List<Object[]> getAllMachine() {
		try
		{
			list=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select m.machinecode,f.type,mtj.capacity,m.mid from machineinfo m left join machinetypejoin mtj on m.mid=mtj.mid left join fueltype f on mtj.typeid=f.typeid;");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object[] obj=new Object[] {rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)};
				list.add(obj);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
		    System.out.println("Error is getall "+ex);	
		    return null;
		}
	}
	@Override
	public boolean isDeleteMachineById(int mid) {
		try
		{
			stmt=conn.prepareStatement("delete from machineinfo where mid=?");
			stmt.setInt(1, mid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}
	@Override
	public boolean isUpdateMachine(MachineModel model) {
		try
		{
			stmt=conn.prepareStatement("update machineinfo set machinecode=? where mid=?");
			stmt.setString(1, model.getMachinecode());
			stmt.setInt(2, model.getId());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}
}





















