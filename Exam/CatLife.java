package Exam;

import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String breed = scanner.nextLine();
        String gender = scanner.nextLine();
        int yearLife = 0;
        boolean invalidCat = false;
        switch (breed) {
            case "British Shorthair":
                if (gender.equals("m")) {
                    yearLife = 13;
                } else if (gender.equals("f")) {
                    yearLife = 14;
                }
                break;
            case "Siamese":
                if (gender.equals("m")) {
                    yearLife = 15;
                } else if (gender.equals("f")) {
                    yearLife = 16;
                }
                break;
            case "Persian":
                if (gender.equals("m")) {
                    yearLife = 14;
                } else if (gender.equals("f")) {
                    yearLife = 15;
                }
                break;
            case "Ragdoll":
                if (gender.equals("m")) {
                    yearLife = 16;

                } else if (gender.equals("f")) {
                    yearLife = 17;
                }
                break;
            case "American Shorthair":
                if (gender.equals("m")) {
                    yearLife = 12;
                } else if (gender.equals("f")) {
                    yearLife = 13;
                }
                break;
            case "Siberian":
                if (gender.equals("m")) {
                    yearLife = 11;
                } else if (gender.equals("f")) {
                    yearLife = 12;
                }
                break;
            default:
                invalidCat = true;

                break;

        }
        double peopleMonths = yearLife * 12.0;
        double catMonths = peopleMonths / 6;
        if (invalidCat){
            System.out.printf("%s is invalid cat!", breed);
        }else{

        System.out.printf("%.0f cat months%n", Math.floor(catMonths));
        }
    }
}
