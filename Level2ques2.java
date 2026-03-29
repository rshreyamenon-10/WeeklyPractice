import java.util.Scanner;

public class Level2ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height (e.g., 175.5): ");
            heights[i] = input.nextDouble();
            System.out.println();
        }

        int minAgeIndex = 0; 
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i; 
            }
        }

        System.out.println("--- Results ---");
        System.out.println("The youngest friend is: " + names[minAgeIndex] + " (" + ages[minAgeIndex] + " years old)");
        System.out.println("The tallest friend is: " + names[maxHeightIndex] + " (" + heights[maxHeightIndex] + " cm/units)");

        input.close();
    }
}