package Exam;

import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double videoCardPrice =Double.parseDouble(scanner.nextLine());
        double adapterPrice = Double.parseDouble(scanner.nextLine());
        double electricityByCardPerDay = Double.parseDouble(scanner.nextLine());
        double profitCard = Double.parseDouble(scanner.nextLine());
        double allVideoCardPrice = videoCardPrice * 13;
        double allAdapterPrice = adapterPrice * 13;
        double totalPrice = allAdapterPrice + allVideoCardPrice + 1000;
        profitCard = profitCard - electricityByCardPerDay;
        double profitCards =profitCard * 13;
        System.out.printf("%.0f%n", totalPrice);
        System.out.printf("%.0f", Math.ceil(totalPrice / profitCards));

    }
}
