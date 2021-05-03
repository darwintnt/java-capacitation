public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weigth;
    private double heigth;
    private String blood;

    /**
     * Description: Init new Patient.
     * @param name Name
     * @param email Speciality
     */
    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
