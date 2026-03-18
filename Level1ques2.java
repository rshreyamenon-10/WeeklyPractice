import java.util.Scanner;

public class Level1ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Please enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Analysis Results ---");

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        System.out.println("\n--- Comparison (First vs Last) ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first element (" + first + ") is equal to the last element (" + last + ").");
        } else if (first > last) {
            System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        }

        scanner.close();
    }
}