package ForLoop.ForLoopExercise;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washer = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        double moneyBirthday = 0;
        double sumMoney = 0;
        int brotherTakes = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                toysCount++;
            }else {
                moneyBirthday += 10;
                sumMoney += moneyBirthday;
                brotherTakes++;
            }
        }
        toyPrice = toyPrice * toysCount;
        sumMoney = sumMoney - brotherTakes;
        double lilysMoney = toyPrice + sumMoney;
        if (lilysMoney >= washer){
            System.out.printf("Yes! %.2f", lilysMoney - washer);
        }else {
            System.out.printf("No! %.2f", washer - lilysMoney);
        }
    }
}
