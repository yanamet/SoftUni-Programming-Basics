package FirstStepsInCodingExersice;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volumeCM = lenght * height * width;
        double volumeLit = volumeCM * 0.001;
        double unness = volumeLit * (percent / 100.0);
        double neededLit = volumeLit - unness;
        System.out.printf("%.2f", neededLit);

    }
}
