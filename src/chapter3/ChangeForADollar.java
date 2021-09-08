package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main (String args []) {
        int money = 1;
        System.out.println("Enter the amount of pennies you have:");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Enter the amount of nickels you have:");
        int nickels = scanner.nextInt();

        System.out.println("Enter the amount of dimes you have:");
        int dimes = scanner.nextInt();

        System.out.println("Enter the amount of quarters you have:");
        int quarters = scanner.nextInt();
        scanner.close();

        double totalChange = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
        System.out.println("Your total change is $" + totalChange);

        if(totalChange == money) {
            System.out.println("You win!");
        } else if (totalChange < money){
            double shortChange = money - totalChange;
            System.out.println("You fell short by $" + shortChange);
        } else {
            double excessChange = totalChange - money;
            System.out.println("You have an excess change of $" + excessChange);
        }
    }
}
