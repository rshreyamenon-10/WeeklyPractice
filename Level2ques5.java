import java.util.Scanner;

public class Level2ques5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int originalNumber = input.nextInt();
        int temp = originalNumber;

        int count = 0;
        if (temp == 0) count = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = originalNumber;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;     
        }
        int[] reversedArray = new int[count];
        for (int i = 0; i < count; i++) {
            reversedArray[i] = digits[i];
        }

        System.out.print("The reversed digits are: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        
        input.close();
    }
}