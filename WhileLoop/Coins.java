package WhileLoop;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        double sum = Math.floor(price * 100);
        int coins = 0;
        while (sum > 0) {
            if (sum >= 200) {
                sum -= 200;
                coins++;
            }
            if (sum >= 100) {
                sum -= 100;
                coins++;
            }
            if (sum >= 50) {
                sum -= 50;
                coins++;
            }
            if (sum >= 20) {
                sum -= 20;
                coins++;
            }
            if (sum >= 10) {
                sum -= 10;
                coins++;
            }
            if (sum >= 5) {
                sum -= 5;
                coins++;
            }
            if (sum >= 2) {
                sum -= 2;
                coins++;

            }
            if (sum >= 1) {
                sum -= 1;
                coins++;
            }

        }
        System.out.println(coins);
    }
}
