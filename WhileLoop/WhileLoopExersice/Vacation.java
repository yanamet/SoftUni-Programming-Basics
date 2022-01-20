package WhileLoop.WhileLoopExersice;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int daysSpending = 0;
        int days = 0;
        boolean spendTooMuch = false;
        while (availableMoney < vacationMoney) {
            String action = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            days++;
            switch (action) {
                case "spend":
                    availableMoney -= currentMoney;
                    daysSpending++;
                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                    break;
                case "save":
                    availableMoney += currentMoney;
                    daysSpending = 0;
                    break;
            }
            if (daysSpending == 5) {
                spendTooMuch = true;
                break;
            }
        }
        if (spendTooMuch) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
