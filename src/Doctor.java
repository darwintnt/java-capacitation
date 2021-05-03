import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    String firstName;
    String speciality;
    int age;

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /**
     * Description: Init new Doctor.
     * @param firstName Name
     * @param speciality Speciality
     */
    public Doctor(String firstName, String speciality, int age) {
        this.firstName = firstName;
        this.speciality = speciality;
        this.age = age;
    }

    /**
     * Description: Return the doctor name;
     * @return name
     */
    public String getName() {
        return "Nombre: " + firstName;
    }

    public String getSpeciality() {
        return "Especialidad: " + speciality;
    }

    public String getAge() {
        return "Edad: " + age;
    }

    public void addAvailableAppointment(Date data, String time) {
        availableAppointments.add(new AvailableAppointment(data, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
