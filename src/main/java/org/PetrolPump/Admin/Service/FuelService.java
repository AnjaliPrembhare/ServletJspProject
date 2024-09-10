package org.PetrolPump.Admin.Service;

import java.util.List;

import org.PetrolPump.Admin.Model.FuelModel;

public interface FuelService {
    public boolean isAddFuelModel(FuelModel model);
    public List<FuelModel> getAllFuelTypes();
}
