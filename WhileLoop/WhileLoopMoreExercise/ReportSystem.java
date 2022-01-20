package WhileLoop.WhileLoopMoreExercise;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedAmount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int i = 0;
        double cashMoney = 0;
        double cardMoney = 0;
        int cashCounter =0;
        int cardCounter = 0;
        boolean goalReached = false;
        while (!input.equals("End")) {
            i++;
            int currentAmount = Integer.parseInt(input);
            if (i % 2 != 0){
                if (currentAmount > 100){
                    System.out.println("Error in transaction!");
                }else {
                    cashMoney += currentAmount;
                    System.out.println("Product sold!");
                    cashCounter++;
                }
            }else {
                if (currentAmount < 10){
                    System.out.println("Error in transaction!");
                }else{
                    cardMoney += currentAmount;
                    System.out.println("Product sold!");
                    cardCounter++;
                }
            }
            double allMoney = cardMoney + cashMoney;
            if (allMoney >= expectedAmount){
                goalReached = true;
                break;
            }
            input = scanner.nextLine();
        }
        double avarageCash = cashMoney / cashCounter;
        double avarageCard = cardMoney / cardCounter;

        if (goalReached){
            System.out.printf("Average CS: %.2f%n", avarageCash);
            System.out.printf("Average CC: %.2f%n", avarageCard);
        }else{
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
