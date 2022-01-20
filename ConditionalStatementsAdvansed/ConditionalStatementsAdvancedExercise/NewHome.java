package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantityFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (flower) {
            case "Roses":
                price = quantityFlowers * 5.0;
                if (quantityFlowers > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = quantityFlowers * 3.80;
                if (quantityFlowers > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = quantityFlowers * 2.80;
                if (quantityFlowers > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = quantityFlowers * 3.0;
                if (quantityFlowers < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = quantityFlowers * 2.50;
                if (quantityFlowers < 80) {
                    price *= 1.20;
                }
                break;
        }
        double money = Math.abs(budget - price);
        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantityFlowers, flower, money);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", money);
        }
    }
}
