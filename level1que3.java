import java.util.Scanner;

public class level1que3 {

    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        
        double targetDistance = 5000.0; 
        
        double rounds = targetDistance / perimeter;
        
        return rounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter side 1 (in meters): ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter side 2 (in meters): ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter side 3 (in meters): ");
            double side3 = scanner.nextDouble();

            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("Invalid input. Sides of a park must be greater than 0.");
            } else {
                double exactRounds = computeRounds(side1, side2, side3);
                
                int fullRoundsNeeded = (int) Math.ceil(exactRounds);

                System.out.printf("Exact rounds calculated: %.2f\n", exactRounds);
                System.out.println("The athlete must complete " + fullRoundsNeeded + " full rounds to hit the 5km mark.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values.");
        } finally {
            scanner.close();
        }
    }
}