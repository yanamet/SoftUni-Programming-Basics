package Exam;

import java.util.Scanner;

public class GoldenMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= locationsCount; i++) {
            double expectedGold = Double.parseDouble(scanner.nextLine());
            int daysOnThisLocation = Integer.parseInt(scanner.nextLine());
            double goldPerLocation = 0;
            for (int j = 1; j <= daysOnThisLocation; j++) {
                double gold = Double.parseDouble(scanner.nextLine());
                goldPerLocation += gold;
            }
            double averageGold = goldPerLocation / daysOnThisLocation;
            if (averageGold >= expectedGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            }else {
                System.out.printf("You need %.2f gold.%n", expectedGold - averageGold);
            }
        }
    }
}
