package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double volleytime = (48 - h) * 3.0 / 4;
        volleytime = volleytime + h + (2.0 / 3 * p);
        if (year.equals("leap")){
            volleytime *= 1.15;
        }
        volleytime = Math.floor(volleytime);
        System.out.printf("%.0f", volleytime);
    }
}
