package ConditionalStatements.ConditionalStatementsLab;

import java.util.Scanner;

public class NumbersBetween100and200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if (a < 100){
            System.out.println("Less than 100");
        }
        if (a >= 100 && a <=200){
            System.out.println("Between 100 and 200");
        }
        if (a > 200){
            System.out.println("Greater than 200");
        }
    }
}
