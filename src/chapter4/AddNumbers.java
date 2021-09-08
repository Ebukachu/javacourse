package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System. in);
        boolean again;
        do{
            System.out.println("Enter the first number:");
            double numberOne = scanner.nextDouble();

            System.out.println("Enter the second number");
            double numberTwo = scanner.nextDouble();

            double sum = numberOne + numberTwo;
            System.out.println("Sum is " + sum);

            System.out.println("Do you want to start  over?");
            again = scanner.nextBoolean();

        } while(again);
        scanner.close();
    }

}
