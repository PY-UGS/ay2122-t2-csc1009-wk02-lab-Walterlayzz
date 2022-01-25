import java.util.Scanner;

public class Question2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();
        input.close();
        float average = (number1 + number2 + number3)/3;
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
