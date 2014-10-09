//// Pablo Aviles
// Lab 04
// Loop the loop
/* the program will a number of stars given by the user
    in the number of lines that the user wants. The program
    will run in an infinite loop, to ask the user if he wants
    to continue*/

import java.util.Scanner;

public class LoopTheLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instance of Scanner
        int nStars = 0; // sentinel variable
        String cont = "y"; // Variable to ask if user wants to continue

        while (true) { // infinite look
            System.out.println("Enter an int in between 1 and 15: ");
            if (scanner.hasNextInt()) { // verify if user entered an integer
                nStars = scanner.nextInt();
                if (nStars >= 1 && nStars <= 15) { // verify if the number is in the correct range
                    for (int x = 0; x < nStars; x++) { // print the line of stars
                        System.out.print("*");
                    }
                    for (int x = 0; x <= nStars; x++) { // loop for rows
                        for (int y = 0; y < x; y++) { // loop for columns
                            System.out.print("*");
                        }
                        System.out.print("\n"); // break line
                    }
                } else {
                    System.out.println("Your int was not in the range [1, 15]");
                }
            } else {
                System.out.println("Not an integer");
            }

            System.out.println("Enter y or Y to go again: "); // ask user
            cont = scanner.next(); 
            if (!(cont.equals("y") || cont.equals("Y"))) { // if user does not want to continue infinite loop breaks
                break; 
            }
        }

    }

}
