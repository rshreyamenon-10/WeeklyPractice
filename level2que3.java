import java.util.Scanner;

public class level2que3 {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a year to check: ");
            int year = scanner.nextInt();

            if (year < 1582) {
                System.out.println("Invalid input. Please enter a year greater than or equal to 1582.");
            } else {
                boolean result = isLeapYear(year);

                if (result) {
                    System.out.println("The year " + year + " is a Leap Year.");
                } else {
                    System.out.println("The year " + year + " is NOT a Leap Year.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid whole number for the year.");
        } finally {
            scanner.close();
        }
    }
}