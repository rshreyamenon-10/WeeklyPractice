import java.util.Scanner;

public class level1que2 {

    public static int calculateHandshakes(int n) {
        int combination = (n * (n - 1)) / 2;
        return combination;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            if (numberOfStudents < 0) {
                System.out.println("Please enter a positive number of students.");
            } else {
    
                int maxHandshakes = calculateHandshakes(numberOfStudents);

                System.out.println("Maximum number of possible handshakes: " + maxHandshakes);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a whole number.");
        } finally {
            scanner.close();
        }
    }
}