package WhileLoop;

import java.util.Scanner;

public class Gymnastic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String instrument = scanner.nextLine();
        double score = 0;
        double totalscore = 20;
        switch (country){
            case "Russia":
                switch (instrument){
                    case "ribbon":
                        score = 9.100 + 9.400;
                        break;
                    case "hoop":
                        score = 9.300 + 9.800;
                        break;
                    case "rope":
                        score = 9.600 + 9.000;
                        break;
                }
                break;
            case "Bulgaria":
                switch (instrument){
                    case "ribbon":
                        score = 9.600 + 9.400;
                        break;
                    case "hoop":
                        score = 9.550 + 9.750;
                        break;
                    case "rope":
                        score = 9.500 + 9.400;
                        break;
                }
                break;
            case "Italy":
                switch (instrument){
                    case "ribbon":
                        score = 9.200 + 9.500;
                        break;
                    case "hoop":
                        score = 9.450 + 9.350;
                        break;
                    case "rope":
                        score = 9.700 + 9.150;
                        break;
                }
                break;
        }
        double notEnough = totalscore - score;
        double percenge = (notEnough * 100) / score;
        System.out.printf("The team of %s get %.3f on %s.%n", country, score, instrument);
        System.out.printf("%.2f%%",Math.floor(percenge));
    }
}
