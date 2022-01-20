package NestedLoops.NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        double standard = 0;
        double totalTickets = 0;
        double student = 0;
        double kid = 0;
        while (true) {
            if (movieName.equals("Finish")) {
                break;
            }
            double counter = 0;
            double maxPlaces = Double.parseDouble(scanner.nextLine());
            for (int i = 1; i <= maxPlaces; i++) {
                String type = scanner.nextLine();

                if (type.equals("End")) {
                    break;
                }
                counter++;
                switch (type) {
                    case "standard":
                        standard++;
                        break;
                    case "student":
                        student++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                totalTickets = standard + student + kid;
            }
            double perFull = (counter * 100) / maxPlaces;
            System.out.printf("%s - %.2f%% full.%n", movieName, perFull);

            movieName = scanner.nextLine();
        }
        double studentsPer = (student * 100) / totalTickets;
        double standartPer = (standard * 100) / totalTickets;
        double kidPer = (kid * 100) / totalTickets;
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentsPer);
        System.out.printf("%.2f%% standard tickets.%n", standartPer);
        System.out.printf("%.2f%% kids tickets.%n", kidPer);

    }
}
