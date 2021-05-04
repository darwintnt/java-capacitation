package models;

public class Nurse extends User {

    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String showDataUser() {
        return "Hospital General\n" + "Departamento de Cardilologia\n" + "Enfermera: " + getName();
    }
}
