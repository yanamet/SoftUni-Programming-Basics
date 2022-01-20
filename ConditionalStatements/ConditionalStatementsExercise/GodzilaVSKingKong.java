package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzilaVSKingKong {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());
        budget = budget - (0.10 * budget);
        double clothing = people * priceClothing;
        if (people > 150){
            clothing = 0.9 * clothing;
        }
        budget = budget - clothing;

        if (budget >= 0){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget);
        }else {
            budget = Math.abs(budget);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", budget);
        }
    }
}
