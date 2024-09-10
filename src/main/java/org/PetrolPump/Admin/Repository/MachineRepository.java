package org.PetrolPump.Admin.Repository;
import java.util.List;
import org.PetrolPump.Admin.Model.MachineModel;

public interface MachineRepository {
    public boolean isAddNewMachine(MachineModel model,String typeid[],String[] capacity);
    public List<Object[]> getAllMachine();
    public boolean isDeleteMachineById(int mid);
    public boolean isUpdateMachine(MachineModel model);
}
