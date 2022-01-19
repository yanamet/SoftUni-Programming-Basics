package FirstStepsInCodingExersice;

import java.util.Scanner;

public class VacationBooksList {
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            int page = Integer.parseInt(scan.nextLine());
            int hours = Integer.parseInt(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int allHoursSpent = page / hours ;
            System.out.println(allHoursSpent / days);
        }
}
