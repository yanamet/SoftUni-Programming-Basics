package Exam;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        foodKg = foodKg * 1000;
        int foodSum = 0;
        boolean foodIsOver = false;
        while (!command.equals("Adopted")){
            int currentFood = Integer.parseInt(command);
            foodSum += currentFood;
            command = scanner.nextLine();
        }
            if (foodSum > foodKg){
                foodIsOver = true;

            }
        int diff = Math.abs(foodKg - foodSum);
        if (foodIsOver){
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }else {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        }
    }
}
