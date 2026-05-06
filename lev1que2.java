import java.util.Scanner;

public class lev1que2 {

    public static String getManualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.next();

            System.out.print("Enter start index: ");
            int start = scanner.nextInt();

            System.out.print("Enter end index: ");
            int end = scanner.nextInt();

            if (start < 0 || end > input.length() || start > end) {
                System.out.println("Invalid indices provided.");
                return;
            }

            String manualSub = getManualSubstring(input, start, end);
            String builtInSub = input.substring(start, end);

            boolean isSame = compareUsingCharAt(manualSub, builtInSub);

            System.out.println("Manual Substring (charAt): " + manualSub);
            System.out.println("Built-in Substring method: " + builtInSub);
            System.out.println("Are both substrings equal? " + isSame);

        } catch (Exception e) {
            System.out.println("Error: Please enter a valid string and integer indices.");
        } finally {
            scanner.close();
        }
    }
}