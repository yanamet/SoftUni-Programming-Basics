package WhileLoop;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = "";
        int cCounter = 0;
        boolean isCFound = false;
        int nCounter = 0;
        boolean isNFound = false;
        int oCounter = 0;
        boolean isOFound = false;
        boolean isWordPrinted = false;
        while (!input.equals("End")) {
            char symbol = input.charAt(0);
            if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
                if (symbol == 99) {
                    if (cCounter == 0) {
                        cCounter++;
                        isCFound = true;
                    } else {
                        result += symbol;
                    }
                } else if (symbol == 110) {
                    if (nCounter == 0) {
                        nCounter++;
                        isNFound = true;
                    } else {
                        result += symbol;
                }
                } else if (symbol == 111) {
                    if (oCounter == 0) {
                        oCounter++;
                        isOFound = true;
                    } else {
                        result += symbol;
                    }
                } else {
                    result += symbol;
                }
                if (isCFound && isNFound && isOFound) {
                    System.out.print(result + " ");
                    isWordPrinted = true;
                }
            }

            if (isWordPrinted) {
                cCounter = 0;
                nCounter = 0;
                oCounter = 0;
                isCFound = false;
                isNFound = false;
                isOFound = false;
                isWordPrinted = false;
                result = "";
            }
            input = scanner.nextLine();
        }
    }
}
