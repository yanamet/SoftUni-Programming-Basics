package NestedLoops.NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
            int primeSum = 0;
            int notPrimeSum = 0;
        while (!command.equals("stop")){
            int number = Integer.parseInt(command);
            if (number < 0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            boolean notPrime = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    notPrime = true;
                    break;
                }

            }
            if (notPrime){
                notPrimeSum += number;
            }else {
                primeSum += number;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", notPrimeSum);
    }
}
