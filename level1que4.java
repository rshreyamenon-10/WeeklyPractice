import java.util.Scanner;

public class level1que4 {

    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();

            int result = checkSign(userInput);

            if (result == 1) {
                System.out.println("The number " + userInput + " is POSITIVE.");
            } else if (result == -1) {
                System.out.println("The number " + userInput + " is NEGATIVE.");
            } else {
                System.out.println("The number is ZERO.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please make sure you enter a valid whole number.");
        } finally {
            scanner.close();
        }
    }
}