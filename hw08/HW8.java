/*
Pablo Aviles
Hw 08
The program has three methdos that ask user for an input and return an output.
*/
import java.util.Scanner;

public class HW8 {

    public static void main(String[] args) {

        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        while (input == 'x' || input == 'l') { // While loop forces user to enter the correct input
            if (input == 'x') {  // getInput() will return x if the input was incorrect
                System.out.print("You did not enter a character from the list 'Cc'; try again- ");
                input = getInput(scan, "Cc"); //
            }
            else {
                if (input == 'l') { // getInput() will return l if the input longer than one character
                    System.out.print("You should enter exactly one character- ");
                    input = getInput(scan, "Cc");
                }
            }
        }

        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");

    }

    /**
     *    Method takes a Scanner and a String then it asks the user enter one of the characters from the String.
     *    The method then returns the character
     */
    public static char getInput(Scanner scan, String list) {
        String in = scan.next();
        if ( in .length() > 1) {
            return 'l';
        }

        for (int i = 0; i < list.length(); i++) {
            for (int k = 0; k < in .length(); k++) {
                if (list.charAt(i) == in .charAt(k)) {
                    return in.charAt(k);
                }
            }
        }
        return 'x';
    }

    /**
     *    Method takes a Scanner, a String, and an int. Int is the number of attempts allowed, the user has to input a
     *    one character String that matches one of the characters on the list. Then the method returns the character 
     */
    public static char getInput(Scanner scan, String list, int attempts) {
        String in = scan.next();
        char ch = ' ';

        for (int i = 0; i < attempts; i++) {
            for (int x = 0; x < list.length(); x++) {
                if ( in .charAt(0) == list.charAt(x)) {
                    ch = in .charAt(0);
                }
            }
            if (ch != ' ') {
                return ch;
            }
            else {
                System.out.print("You did not enter a character from the list 'yYnN' try again- "); in = scan.next();
            }
        }
        System.out.println("You failed after " + attempts + " tries");
        return ' ';
    }

    /**
     *   Method takes a Scanner, a String promt and another String. The user has to input what the prompt requires.
     *   The program will continue prompting until the user enter the correct input.
     *   The program returns the input
     */
    public static char getInput(Scanner scan, String prompt, String string) {

        String input = "";
        boolean valid = false;
        char ch = ' ';

        do {
            System.out.print(prompt);
            input = scan.next();
            for (int i = 0; i < string.length(); i++) {
                if (input.charAt(0) == string.charAt(i)) {
                    valid = true;
                    ch = string.charAt(i);
                }
            }
        } while (input.length() > 1 || valid == false);



        return ch;
    }

}
