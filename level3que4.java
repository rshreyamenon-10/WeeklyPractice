import java.util.Arrays;
import java.util.Scanner;

public class level3que4 {

    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) return 1;
        
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer to check: ");
            int number = scanner.nextInt();

            int[] digitsArray = storeDigits(number);
            
            int[] reversedArray = reverseArray(digitsArray);

            System.out.println("\n--- Number Checker Results ---");
            System.out.println("Original Digits Array: " + Arrays.toString(digitsArray));
            System.out.println("Reversed Digits Array: " + Arrays.toString(reversedArray));
            System.out.println("Digit Count:           " + countDigits(number));
            System.out.println("Arrays Match?          " + areArraysEqual(digitsArray, reversedArray));
            System.out.println("Is Palindrome:         " + isPalindrome(digitsArray));
            System.out.println("Is Duck Number:        " + isDuckNumber(digitsArray));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}