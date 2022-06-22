public interface AppointmentRepository{
public Appoinment getAppointment(long bookingid);
public Appoinment addAppointment(Appoinment app);
public Appoinment updateAppointment(Appoinment app);
public Appoinment deleteAppoinment(Appoinment app);
}
