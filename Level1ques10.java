import java.util.Scanner;

public class Level1ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number >= 0) {
            String[] results = new String[number + 1];
            for (int i = 0; i <= number; i++) {
                if (i == 0) {
                    results[i] = "0"; // 0 is usually kept as 0 in FizzBuzz
                } else if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = Integer.toString(i);
                }
            }

            System.out.println("\n--- Array Results ---");
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}