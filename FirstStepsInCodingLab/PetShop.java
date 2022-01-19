package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());
        double PriceDogs = dogs * 2.50;
        double PriceAnimals = animals * 4.0;
        double price = PriceAnimals + PriceDogs;
        System.out.println(price + " lv.");
    }
}
