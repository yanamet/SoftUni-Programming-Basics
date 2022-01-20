package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (fishers <= 6) {
            price *= 0.90;
        } else if (fishers <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn"))
        {
            price *= 0.95;
        }
        double money = Math.abs(budget - price);
        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", money);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", money);
        }
    }
}
