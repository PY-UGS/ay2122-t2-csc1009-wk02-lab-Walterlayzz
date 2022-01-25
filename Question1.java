import java.util.Scanner;

public class Question1 {
    public static void main (String[] args) {
        double pi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radiusInput = input.nextDouble();
        input.close();
        // Calculate Area
        double area = (radiusInput * radiusInput) * pi;
        System.out.println("The area for the circle of radius " + radiusInput + " is " + area);
    }
}
