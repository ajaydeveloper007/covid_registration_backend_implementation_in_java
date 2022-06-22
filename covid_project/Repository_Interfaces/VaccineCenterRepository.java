public interface VaccineCenterRepository{
public VaccinationCenter getVaccineCenter(int centerid);
public VaccinationCenter addVaccineCenter(VaccinationCenter center);
public VaccinationCenter updateVaccineCenter(VaccinationCenter center);
public boolean deleteVaccineCenter(VaccinationCenter center);

}
