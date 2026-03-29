import java.util.Scanner;

public class Level1ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of the 11 players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            
            sum += heights[i];
        }

        double meanHeight = sum / 11;

        System.out.println("\n--- Results ---");
        System.out.printf("The mean height of the football team is: %.2f", meanHeight);
        
        input.close();
    }
}