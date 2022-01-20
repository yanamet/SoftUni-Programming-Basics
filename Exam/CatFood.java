package Exam;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int catCount = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double allFood = 0;
        for (int i = 1; i <= catCount; i++) {
            double foodPerCat = Double.parseDouble(scanner.nextLine());
            allFood += foodPerCat;
            if (foodPerCat >= 100 && foodPerCat < 200){
                smallCats++;
            }else if (foodPerCat >= 200 && foodPerCat < 300){
                bigCats++;
            }else if(foodPerCat >= 300 && foodPerCat < 400){
                hugeCats++;
            }
        }
        double totalPerDay = (allFood / 1000) * 12.45;
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", hugeCats);
        System.out.printf("Price for food per day: %.2f lv.", totalPerDay);
    }
}
