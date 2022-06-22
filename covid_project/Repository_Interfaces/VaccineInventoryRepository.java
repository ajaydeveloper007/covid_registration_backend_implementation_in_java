public interface VaccineInventoryRepository{

public VaccineInventory getVaccineInventoryByCenter(int centerid);
public VaccineInventory addVaccineCount(VaccineInventory inv);
public VaccineInventory updateVaccineInventory(VaccineInventory inv);
public boolean deleteVaccineInventory(int VaccineInventory);
public VaccineInventory[] getVaccineInventoryByDate(LocalDate date);
public VaccineInventory[] getVaccineInventoryByVaccine(Vaccine Vaccine);
}


