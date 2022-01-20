package Exam;

import java.util.Scanner;

public class Ship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeight = Double.parseDouble(scanner.nextLine());
        double shipVolume = width * length * height;
        double widthRoom = 2.0;
        double lengthRoom = 2.0;
        double heightRoom = averageHeight + 0.4;
        double roomVolume = widthRoom * lengthRoom * heightRoom;
        double space = Math.floor(shipVolume / roomVolume);
        if (space >= 3 && space <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.%n", space);
        }else if (space < 3){
            System.out.println("The spacecraft is too small.");
        }else {
            System.out.println("The spacecraft is too big.");
        }

    }
}
