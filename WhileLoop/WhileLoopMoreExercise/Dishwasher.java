package WhileLoop.WhileLoopMoreExercise;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prepCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        prepCount = prepCount * 750;
        int washedDishes = 0;
        int washedPots = 0;
        int currentPrep = 1;
        int counter = 0;
        boolean prepIsOver = false;
        while (!input.equals("End")){
            int dishesCount = Integer.parseInt(input);
            counter++;
            if (counter > 2){
                currentPrep = dishesCount * 15;
                prepCount -= currentPrep;
                washedPots += dishesCount;
                counter = 0;
            }else {
                currentPrep = dishesCount * 5;
                prepCount -= currentPrep;
                washedDishes += dishesCount;
            }
            if (prepCount < 0){
                prepIsOver = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (prepIsOver){
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(prepCount));
        }else {
            System.out.printf("Detergent was enough!%n" +
                    "%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", washedDishes, washedPots, prepCount);
        }

    }
}
