package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (fruit) {
            case "banana":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 2.50;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 2.70;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "apple":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 1.20;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 1.25;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "orange":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 0.85;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 0.90;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "grapefruit":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 1.45;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 1.60;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "kiwi":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 2.70;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 3.00;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "pineapple":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 5.50;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 5.60;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "grapes":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 3.85;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 4.20;
                        break;

                    default:
                        System.out.println("error");
                }
                break;
            default:{
                System.out.println("error");
            }
        }
       if (price != 0){
           System.out.printf("%.2f", price * quantity);
       }
    }
}
