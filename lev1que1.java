import java.util.Scanner;

public class lev1que1 {

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
            System.out.print("Enter the first string: ");
            String str1 = scanner.next();

            System.out.print("Enter the second string: ");
            String str2 = scanner.next();

            boolean customMethodResult = compareUsingCharAt(str1, str2);
            boolean builtInMethodResult = str1.equals(str2);

            System.out.println("Result using custom charAt() method: " + customMethodResult);
            System.out.println("Result using built-in equals() method: " + builtInMethodResult);

            if (customMethodResult == builtInMethodResult) {
                System.out.println("\nVerification passed! Both methods yield the same result.");
            } else {
                System.out.println("\nVerification failed. The results do not match.");
            }
        } finally {
            scanner.close();
        }
    }
}