package ui;

import models.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;

        do {
            out.println("\n\n");
            out.println("Welcome Doctor: " + UIMenu.doctorLogged.getName());
            out.println("1. Add available appointment");
            out.println("2. My Schedule appointment");
            out.println("0. Logout");

            Scanner selectedOption = new Scanner(in);
            response = Integer.parseInt(selectedOption.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentMenu();
                    break;
                case 2:
                    out.println("::My Appointments");
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    out.println("Selected one option!");
            }
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentMenu() {

        int response = 0;

        do {
            out.println("\n\n");
            out.println("::Available appointment");
            out.println("::Selected at month");

            for (int i = 1; i < 4; i++) {
                out.println(i + ". " + UIMenu.MONTHS[i - 1]);
            }

            out.println("0. Return");

            Scanner selectedOption = new Scanner(in);
            response = Integer.parseInt(selectedOption.nextLine());

            if (response > 0 && response < 4) {

                out.println(response + ". " + UIMenu.MONTHS[response - 1]);

                out.println("::Insert the date available: [dd/mm/yyyy]");
                String date = selectedOption.nextLine();

                out.println("::Your date is: "+ date + "\n1. Correct \n2. Change date");

                int responseDate = Integer.parseInt(selectedOption.nextLine());

                if(responseDate == 2) continue;

                int responseTime = 0;
                String time = "";

                do {
                    out.println("::Insert the time available for date: " + date + " [16:00]");
                    time = selectedOption.nextLine();
                    out.println("::Your time is: " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.parseInt(selectedOption.nextLine());
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);

                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            } else if(response == 0) {
                showDoctorMenu();
            }

        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
