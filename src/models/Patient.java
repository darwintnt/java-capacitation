package models;

public class Patient extends User {

    private String birthday;
    private String blood;
    private double weigth;
    private double heigth;

    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbirthday: '" + birthday + '\'' +
                "\nblood: '" + blood + '\'' +
                "\nweigth: " + weigth +
                "\nheigth: " + heigth;
    }

    @Override
    public String showDataUser() {
        return "Hospital General\n" + "Pacientes de Cancerologia\n" + "Paciente: " + getName() + "\nEmail: " + getEmail();
    }
}
