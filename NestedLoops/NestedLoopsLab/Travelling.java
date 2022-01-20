package NestedLoops.NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            double minSum = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < minSum) {
                double currentSum = Double.parseDouble(scanner.nextLine());
                sum += currentSum;
            }
            System.out.printf("Going to %s!%n", command);
            command = scanner.nextLine();
        }
    }
}
