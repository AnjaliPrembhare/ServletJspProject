package org.PetrolPump.Admin.Service;
import org.PetrolPump.Admin.Model.MachineModel;
import java.util.*;
public interface MachineService {
   public boolean isAddNewMachine(MachineModel model,String typeid[],String[] capacity);
   public List<Object[]> getAllMachine();
   public boolean isDeleteMachineById(int mid);
   public boolean isUpdateMachine(MachineModel model);
}
