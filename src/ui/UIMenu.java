package ui;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class UIMenu {

    public static final String[] MONTHS = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

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
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    out.println("Thank you for you visit!");
                    break;
                default:
                    out.println("Selected one option!");
            }

        } while(response != 0);
    }

    static void showPatientMenu() {
        int response = 0;

        do {
            out.println("\n\n");
            out.println("Patient");
            out.println("1. Book an appointment");
            out.println("2. My Appointments");
            out.println("0. Return");

            Scanner selectedOption = new Scanner(in);
            response = Integer.parseInt(selectedOption.nextLine());

            switch (response) {
                case 1:
                    out.println("::Book an Appointments");
                    for (int i = 1; i < 4; i++) {
                        out.println(i + ". " + MONTHS[i - 1]);
                    }
                    break;
                case 2:
                    out.println("::My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    out.println("Selected one option!");
            }
        } while (response != 0);
    }
}
