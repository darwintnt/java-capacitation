package models;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private int age;
    private String speciality;

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /**
     * Description: Init new models.Doctor.
     * @param speciality Speciality
     * @param age Age
     */
    public Doctor(String name, String email, String speciality, int age) {
        super(name, email);
        this.speciality = speciality;
        this.age = age;
    }

    public String getSpeciality() {
        return "Especialidad: " + speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAge() {
        return "Edad: " + age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAvailableAppointment(Date data, String time) {
        availableAppointments.add(new AvailableAppointment(data, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+ speciality + "\nAge: " + age + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public String showDataUser() {
        return "Hospital General\n" + "Departamento de Cancerologia\n" + "Doctor: " + getName();
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

        @Override
        public String toString() {
            return "\n========= AvailableAppointment ========== \nDate: " + date + "\nTime: " + time;
        }
    }

}
