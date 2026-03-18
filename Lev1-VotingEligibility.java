import java.util.Scanner;

public class Lev1-VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Please enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Voting Eligibility Results ---");
        
        for (int i = 0; i < ages.length; i++) {
            int currentAge = ages[i];
            
            if (currentAge < 0) {
                System.out.println("Invalid age: " + currentAge);
            } else if (currentAge >= 18) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            } else {
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }
        
        scanner.close();
    }
}