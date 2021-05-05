package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
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
