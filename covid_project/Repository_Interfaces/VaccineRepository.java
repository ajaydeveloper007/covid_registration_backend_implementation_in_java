public interface VaccineRepository{
  public Vaccine getVaccineByName(String vaccineName);
  public Vaccine getVaccineById(int vaccineId);
  public Vaccine addVaccine(Vaccine vaccine);
  public Vaccine updateVaccine(Vaccine vaccine);
  public boolean deleteVaccine(Vaccine vaccine);
}