public interface VaccineService{
  public Vaccine getVaccineByName(String vaccineName);
  public Vaccine getVaccineById(int vaccineid);
  public Vaccine addVaccine(Vaccine vaccine);
  public vaccine updateVaccine(Vaccine vaccine);
  public boolean deleteVaccine(Vaccine vaccine);
  
}