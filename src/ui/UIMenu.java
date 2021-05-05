package ui;

import models.Doctor;
import models.Patient;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class UIMenu {

    public static final String[] MONTHS = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;


    public static void showMenu() {
        int response = 0;
        out.println("Welcome to my appointments");
        out.println("Seleccione una opción");

        do {
            out.println("1. Doctor");
            out.println("2. Patient");
            out.println("0. Exit");

            Scanner optionSelected = new Scanner(in);
            response = Integer.parseInt(optionSelected.nextLine());

            switch (response) {
                case 1:
                    out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    out.println("Patient");
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    out.println("Thank you for you visit!");
                    break;
                default:
                    out.println("Selected one option!");
            }

        } while(response != 0);
    }

    private static void authUser(int userType) {
        // userType = 1 -> Doctor
        // userType = 2 -> Patient
        // userType = 3 -> Nurse
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Luisa Cortez", "luisacortez@hotmail.com", "Médico General", 30));
        doctors.add(new Doctor("Jose Martinez", "josemartinez@yahoo.com", "Cirujano", 65));
        doctors.add(new Doctor("pedro Paramo", "pedroparamo@gmail.com", "Endocrinologo", 37));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Luisa2 Cortez", "luisacortez2@hotmail.com"));
        patients.add(new Patient("Jose2 Martinez", "josemartinez2@yahoo.com"));
        patients.add(new Patient("pedro2 Paramo", "pedroparamo2@gmail.com"));

        boolean emailCorrect = false;

        do {
            out.println("Insert your email");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor doctor: doctors) {
                    if (doctor.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = doctor;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2) {
                for (Patient patient: patients) {
                    if (patient.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = patient;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);

    }
}
