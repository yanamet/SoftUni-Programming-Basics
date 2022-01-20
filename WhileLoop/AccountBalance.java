package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0;
        while (!command.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(command);
            if (amount < 0){
                System.out.println("Invalid operation!");
                break;
            }
            sum += amount;
            System.out.printf("Increase: %.2f%n", amount);
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
