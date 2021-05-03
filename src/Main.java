import static ui.UIMenu.showMenu;

import static utils.Operation.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

//        showMenu();
        Doctor doctor = new Doctor("Jose Andres", "Cirujano", 39);
        out.println("Nombre Doctor: " + doctor.getName());
        out.println(doctor.getSpeciality());
        out.println(doctor.getAge());
        out.println("======================================");


        Patient patient = new Patient("Luis Suarez", "luisuarez@gmail.com");
        out.println("Nombre Paciente: " + patient.getName());
        out.println("Email Paciente: " + patient.getEmail());


        double circleArea = getCircleArea(5);
        out.println("Área del circulo: " + circleArea);
    }
}
