
import java.util.Scanner;

public class BoolaBoola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean a = Math.random() < 0.5;
        boolean b = Math.random() < 0.5;
        boolean c = Math.random() < 0.5;
        boolean andOr1 = Math.random() < 0.5;
        boolean andOr2 = Math.random() < 0.5; // if true operator will be &&, if false operator will be or
        String response = "";

        if (andOr1) {
            if (andOr2) {
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
            } else {
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
        } else {
            if (andOr2) {
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
            } else {
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
