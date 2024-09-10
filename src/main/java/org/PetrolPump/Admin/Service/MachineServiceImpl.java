package org.PetrolPump.Admin.Service;
import java.util.List;

import org.PetrolPump.Admin.Model.MachineModel;
import org.PetrolPump.Admin.Repository.MachineRepository;
import org.PetrolPump.Admin.Repository.MachineRepositoryImpl;

public class MachineServiceImpl implements MachineService{
	MachineRepository m=new MachineRepositoryImpl();

	@Override
	public boolean isAddNewMachine(MachineModel model,String typeId[],String[] capacity) {
		return m.isAddNewMachine(model,typeId,capacity);
	}

	@Override
	public List<Object[]> getAllMachine() {
		return m.getAllMachine();
	}

	@Override
	public boolean isDeleteMachineById(int mid) {
		return m.isDeleteMachineById(mid);
	}

	@Override
	public boolean isUpdateMachine(MachineModel model) {
		return m.isUpdateMachine(model);
	}
}
