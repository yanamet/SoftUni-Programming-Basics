package FirstStepsInCodingExersice;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());
        int term = Integer.parseInt(scan.nextLine());
        double firstInterest = Double.parseDouble(scan.nextLine());
        double secondInterest = sum * (firstInterest / 100);
        double month = secondInterest / 12;
        double result = sum + term * month;
        System.out.println(result);

    }

}
