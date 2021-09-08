package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main (String args []) {
        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade) {
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Great!";
                break;
            case "C":
                message = "Good!";
                break;
            case "D":
                message = "Step up.";
                break;
            case "F":
                message = "Dolt";
                break;
            default:
                message = "Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
