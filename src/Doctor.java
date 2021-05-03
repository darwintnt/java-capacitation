public class Doctor {

    String firstName;
    String speciality;
    int age;

    /**
     * Description: Init new Doctor.
     * @param firstName Name
     * @param speciality Speciality
     */
    Doctor(String firstName, String speciality, int age) {
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

}
