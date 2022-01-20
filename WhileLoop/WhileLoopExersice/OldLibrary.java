package WhileLoop.WhileLoopExersice;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String input = scanner.nextLine();
        boolean bookIsFound = false;
        int booksCount = 0;
        while (!input.equals("No More Books")) {
            if (input.equals(searchedBook)) {
                bookIsFound = true;
                break;
            }
                booksCount++;

            input = scanner.nextLine();
        }
        if (bookIsFound){
            System.out.printf("You checked %d books and found it.", booksCount);
        }else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", booksCount);
        }
    }
}
