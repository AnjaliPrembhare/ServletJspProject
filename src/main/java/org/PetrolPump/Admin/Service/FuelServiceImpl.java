package org.PetrolPump.Admin.Service;
import java.util.List;

import org.PetrolPump.Admin.Model.FuelModel;
import org.PetrolPump.Admin.Repository.FuelRepositoryImpl;
import org.PetrolPump.Admin.Repository.FuelRepository;

public class FuelServiceImpl implements FuelService {
	FuelRepository fuelRepo=new FuelRepositoryImpl();
	@Override
	public boolean isAddFuelModel(FuelModel model) {
		return fuelRepo.isAddFuelType(model);
	}
	@Override
	public List<FuelModel> getAllFuelTypes() {
		return fuelRepo.getAllFuelTypes() ;
	}

}
