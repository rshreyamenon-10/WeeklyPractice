import java.util.Scanner;
import java.util.Arrays;

public class lev1que3 {

    public static char[] getCharsManually(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a word: ");
            String input = scanner.next();

            char[] manualArray = getCharsManually(input);
            char[] builtInArray = input.toCharArray();

            boolean areEqual = compareCharArrays(manualArray, builtInArray);

            System.out.println("Manual Array:   " + Arrays.toString(manualArray));
            System.out.println("Built-in Array: " + Arrays.toString(builtInArray));
            System.out.println("Are the results identical? " + areEqual);

        } finally {
            scanner.close();
        }
    }
}