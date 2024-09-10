package org.PetrolPump.Admin.Repository;
import java.util.*;
import org.PetrolPump.Admin.Model.FuelModel;

public interface FuelRepository {
	public boolean isAddFuelType(FuelModel model);
	public List<FuelModel> getAllFuelTypes();

}
