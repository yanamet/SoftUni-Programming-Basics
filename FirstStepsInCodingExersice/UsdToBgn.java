package FirstStepsInCodingExersice;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double usd = Double.parseDouble(input);
        double bgn = usd * 1.79549;
        System.out.print(bgn);
    }
}
