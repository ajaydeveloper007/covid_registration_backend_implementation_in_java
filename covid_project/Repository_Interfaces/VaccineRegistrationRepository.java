public interface VaccineRegistrationRepository{
  public VaccineRegistration getVaccineRegistration(long mobileno);
  public VaccineRegistration getAllmember(long mobileno);
  public VaccineRegistration addVaccineRegistration(VaccineRegistration reg);
  public VaccineRegistration updateVaccineRegistration(VaccineRegistration reg);
  public boolean deleteVaccineRegistration(VaccineRegistration reg);
}