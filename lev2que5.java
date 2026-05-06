import java.util.Scanner;

public class lev2que5 {

    public static String checkCharType(char c) {
        int ascii = (int) c;

        if (ascii >= 65 && ascii <= 90) {
            ascii = ascii + 32;
            c = (char) ascii;
        }

        if (ascii >= 97 && ascii <= 122) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String input = scanner.nextLine();

         int[] counts = countVowelsAndConsonants(input);

         System.out.println("Total Vowels:     " + counts);
         System.out.println("Total Consonants: " + counts);

         scanner.close();

    
   }
}