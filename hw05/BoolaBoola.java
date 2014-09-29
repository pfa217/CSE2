//// Pablo Aviles
// Lab 04
// Boola boola
// The program assigns three random boolean values and asks the user to perform a logic operation. If the operation is correct, a correct message will be displayed.
// if it is incorrect, a try again message will be displayed

import java.util.Scanner;

public class BoolaBoola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        boolean a = Math.random() < 0.5; // If the number returned is less than 0.5, variable will be initiated as true, if its more than 0.5, it will be initiated as false
        boolean b = Math.random() < 0.5;
        boolean c = Math.random() < 0.5;
        boolean andOr1 = Math.random() < 0.5;
        boolean andOr2 = Math.random() < 0.5; // if true operator will be &&, if false operator will be or
        String response = "";
        

        if (andOr1) {   // If statement for first operator True will be &&
            if (andOr2) { // second operator as and
                System.out.print("Does " + a + " && " + b + " && " + c + " have the value of true(t/T) or false(f/F): ");
                response = scanner.next();
                if ((a && b || c)) { 
                    if (response.equals("T") || response.equals("t")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, Try again");
                    }
                } else {
                    if (response.equals("F") || response.equals("f")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, try again");
                    }
                }
            } else { // Second operator as or
                System.out.print("Does " + a + " && " + b + " || " + c + " have the value of true(t/T) or false(f/F): ");
                response = scanner.next();
                if ((a && b || c)) {
                    if (response.equals("T") || response.equals("t")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, Try again");
                    }
                } else {
                    if (response.equals("F") || response.equals("f")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, try again");
                    }
                }
            }
        } else { // Else will make first operator ||
            if (andOr2) { // second operator &&
                System.out.print("Does " + a + " || " + b + " && " + c + " have the value of true(t/T) or false(f/F): ");
                response = scanner.next();
                if ((a || b && c)) {
                    if (response.equals("T") || response.equals("t")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, Try again");
                    }
                } else {
                    if (response.equals("F") || response.equals("f")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, try again");
                    }
                }
            } else { // second operator ||
                System.out.println("Does " + a + " || " + b + " || " + c + " have the value of true(t/T) or false(f/F): ");
                response = scanner.next();
                if ((a || b || c)) {
                    if (response.equals("T") || response.equals("t")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, Try again");
                    }
                } else {
                    if (response.equals("F") || response.equals("f")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong, try again");
                    }
                }
            }
        }

    }

}
