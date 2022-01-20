package ConditionalStatements.ConditionalStatementsLab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int greaterNumber;
        if (firstNumber > secondNumber) {
            greaterNumber = firstNumber;
        } else {
            greaterNumber = secondNumber;
        }
        System.out.println(greaterNumber);
    }
}

