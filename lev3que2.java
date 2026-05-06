import java.util.Scanner;

public class lev3que2 {

    public static int findLength(String str) {
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

    public static char[] findUniqueCharacters(String str) {
        int len = findLength(str);
        char[] tempArray = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            boolean isAlreadyPresent = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isAlreadyPresent = true;
                    break;
                }
            }

            if (!isAlreadyPresent) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempArray[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueResult = findUniqueCharacters(input);

        System.out.print("Unique characters found: ");
        for (int i = 0; i < uniqueResult.length; i++) {
            System.out.print(uniqueResult[i] + (i < uniqueResult.length - 1 ? ", " : ""));
        }
        System.out.println("\nTotal Unique Count: " + uniqueResult.length);

        scanner.close();
    }
}