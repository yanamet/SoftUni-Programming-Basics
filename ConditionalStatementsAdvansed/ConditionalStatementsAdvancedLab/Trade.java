package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class Trade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sell = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        String result = "";
        if (sell >= 0 && sell <= 500) {
            switch (town) {
                case "Sofia":
                    commission = 0.05 * sell;
                    break;
                case "Varna":
                    commission = 0.045 * sell;
                    break;
                case "Plovdiv":
                    commission = 0.055 * sell;
                    break;
                default:
                    result = "error";
                    break;


            }
        } else if (sell > 500 && sell <= 1000) {
            switch (town) {
                case "Sofia":
                    commission = 0.07 * sell;
                    break;
                case "Varna":
                    commission = 0.075 * sell;
                    break;
                case "Plovdiv":
                    commission = 0.08 * sell;
                    break;
                default:
                    result = "error";
                    break;

            }
        } else if (sell > 1000 && sell <= 10000) {
            switch (town) {
                case "Sofia":
                    commission = 0.08 * sell;
                    break;
                case "Varna":
                    commission = 0.1 * sell;
                    break;
                case "Plovdiv":
                    commission = 0.12 * sell;
                    break;
                default:
                    result = "error";
                    break;

            }
        } else {
            switch (town) {
                case "Sofia":
                    commission = 0.12 * sell;
                    break;
                case "Varna":
                    commission = 0.13 * sell;
                    break;
                case "Plovdiv":
                    commission = 0.145 * sell;
                    break;
                default:
                    result = "error";
                    break;
            }
        }
        if (sell < 0 || result.equals("error")){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", commission);
        }

}
}
