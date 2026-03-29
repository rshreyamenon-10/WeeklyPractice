import java.util.Scanner;

public class Level3ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long temp = Math.abs(number);
        long temp2 = temp;

        int count = 0;
        if (temp == 0) count = 1;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = temp2;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i]; 
            frequency[digitValue]++;
        }

        System.out.println("\nDigit Frequency Table:");
        System.out.println("---------------------");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}