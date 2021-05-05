package ui;

import models.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;
import static java.lang.System.out;

public class UIPatientMenu {

    public static void showPatientMenu() {

        int response = 0;

        do {
            out.println("\n\n");
            out.println("Welcome Patient: " + UIMenu.patientLogged.getName());
            out.println("1. Book an appointment");
            out.println("2. My appointments");
            out.println("0. Logout");

            Scanner sc = new Scanner(in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    out.println("Selected one option!");
            }
        } while (response != 0);
    }


    private static void showBookAppointmentMenu() {

        int response = 0;

        do {
            out.println("\n\n");
            out.println("::Book an appointment");
            out.println("::Select date");
            // Lleva la númeración de la lista de fechas
            // Indice de la fecha seleccionada por el paciente

            int k = 0;
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>(); // It's Crazy :( !!!

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(k,doctorAppointments);
                }
            }

            Scanner sc = new Scanner(in);
            int responseDateSelected = Integer.parseInt(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);

            Integer indexDate = 0;

            Doctor doctorSelected = new Doctor("", "", "", 0);

            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            out.println("Doctor: " + doctorSelected.getName() +
                    "\nDate: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    "\nTime: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime()
            );

            out.println("::Confirm your appointment: \n1. Yes \n2. Change Data");

            response = Integer.parseInt(sc.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime()
                );

                showPatientMenu();
            }

        } while (response != 0);
    }

    private static void showMyAppointments() {

        int response = 0;

        do {

            out.println("::My Appointments");

            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
                out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                out.println(j + ". " +
                        "\nDate: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "\nTime: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\nDoctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor()
                );
            }

            out.println("0. Return");
            Scanner sc = new Scanner(in);
            response = Integer.parseInt(sc.nextLine());

        } while (response != 0);

    }
}
