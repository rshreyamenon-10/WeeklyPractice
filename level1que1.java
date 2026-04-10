import java.util.Scanner;

public class level1que1 {

    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = input.nextDouble();

        System.out.print("Enter Rate: ");
        double r = input.nextDouble();

        System.out.print("Enter Time: ");
        double t = input.nextDouble();

        double si = calculateSI(p, r, t);

        System.out.print("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
        
        input.close();
    }
}