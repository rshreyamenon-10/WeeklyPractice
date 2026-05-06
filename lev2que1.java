import java.util.Scanner;

public class lev2que1 {

    public static int findLengthManually(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.next();

            int manualLength = findLengthManually(input);
            int builtInLength = input.length();

            System.out.println("Manual length (using exception logic): " + manualLength);
            System.out.println("Built-in length() method result:     " + builtInLength);

            if (manualLength == builtInLength) {
                System.out.println("\nSuccess: The lengths match!");
            }

        } finally {
            scanner.close();
        }
    }
}