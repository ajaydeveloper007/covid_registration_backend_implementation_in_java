public interface VaccineInventoryService{
  public VaccineInventory getVaccineInventoryByCenter(int centerid);
  public VaccineInventory addVaccineCount(VaccineInventory inv);
  public VaccineInventory updateVaccineInventory(VaccineInventory inv);
  public boolean deleteVVacineInventory(VaccineInventory inv);
}
  