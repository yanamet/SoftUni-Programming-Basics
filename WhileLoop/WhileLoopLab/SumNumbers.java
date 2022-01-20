package WhileLoop.WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumNum = 0;
        while (true){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumNum += currentNum;
            if (sumNum >= n){
                break;
            }
        }
        System.out.println(sumNum);
    }
}
