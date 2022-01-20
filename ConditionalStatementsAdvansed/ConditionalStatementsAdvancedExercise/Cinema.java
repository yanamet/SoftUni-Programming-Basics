package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price = 0;
        int allPlaces = r * c;
        switch (projection){
            case "Premiere":
                price = (r * c) * 12.00;
                break;
            case "Normal":
                price = allPlaces * 7.50;
                break;
            case "Discount":
                price = allPlaces * 5.00;
                break;

        }
        System.out.printf("%.2f leva", price);
    }
}
