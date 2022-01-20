package WhileLoop.WhileLoopMoreExercise;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = "";
        int cCounter = 0;
        boolean isCfound = false;
        int oCounter = 0;
        boolean isOfound = false;
        int nCounter = 0;
        boolean isNfound = false;
        boolean wordIsPrinted = false;
        while (!input.equals("End")) {
            char symbol = input.charAt(0);
            if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
                if (symbol == 99) {
                    if (cCounter == 0) {
                        cCounter++;
                        isCfound = true;
                    } else {
                        result += symbol;
                    }
                } else if (symbol == 110) {
                    if (nCounter == 0) {
                        nCounter++;
                        isNfound = true;
                    } else {
                        result += symbol;

                    }
                } else if (symbol == 111) {
                    if (oCounter == 0) {
                        isOfound = true;
                        oCounter++;

                    } else {
                        result += symbol;
                    }
                }
                if (isCfound && isNfound && isOfound) {
                    System.out.print(result + " ");
                    wordIsPrinted = true;

                }
            }
            if (wordIsPrinted) {
                nCounter = 0;
                cCounter = 0;
                oCounter = 0;
                isCfound = false;
                isNfound = false;
                isOfound = false;
                result = "";
            }
            input = scanner.nextLine();
        }
    }
}
