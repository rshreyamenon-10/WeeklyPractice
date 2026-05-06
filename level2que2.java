import java.util.Scanner;

public class level2que2 {

    public static long sumRecursive(long n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }

    public static long sumFormula(long n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a natural number: ");
            long n = scanner.nextLong();

            if (n <= 0) {
                System.out.println("Invalid input. A natural number must be greater than 0.");
            } else {
                long recursiveResult = sumRecursive(n);
                long formulaResult = sumFormula(n);

                System.out.println("Sum using recursion: " + recursiveResult);
                System.out.println("Sum using formula:   " + formulaResult);

                if (recursiveResult == formulaResult) {
                    System.out.println("\nBoth computations match! The result is correct.");
                } else {
                    System.out.println("\nThe computations do not match.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid whole number.");
        } finally {
            scanner.close();
        }
    }
}