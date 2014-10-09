/*
Pablo Aviles
Hw 05
Burger King
The program gives the user options at burger king and prints out their order
*/
import java.util.Scanner;

// Start of class
public class BurgerKing {
    
    // main method
    public static void main(String[] args) {
        
        // varibles
        Scanner scanner = new Scanner(System.in);
        String input = "";
        char ch = ' ';
        String burgerChoice = " ";
        String sodaChoice = " ";
        String friesChoice = " ";
        
        // Strings for menus
        String choice = "Enter a letter to indicate a choice of \n"
                + "\t Burger (B or b)\n"
                + "\t Soda (S or s)\n"
                + "\t Fries (F or f): ";

        String burger = "Enter A or a for 'All the fixins' \n"
                + "\t C or c for cheese\n"
                + "\t N or n for none of the above: ";

        String soda = "Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s) or Mountain Dew (M or m)";

        String fries = "Do you want a large or small order of fries (l,L,s, or S)";
    
        // input for choice 
        System.out.println(choice);
        input = scanner.next();
        ch = input.charAt(0);

        if (!(input.length() > 1)) { // verifies the choice is not more than one character
            switch (ch) {
                // Choice of burger
                case 'B':
                case 'b':
                    System.out.println(burger);
                    burgerChoice = scanner.next();
                    if (!(burgerChoice.length() > 1)) {
                        switch (burgerChoice.charAt(0)) {
                            case 'A':
                            case 'a':
                                System.out.println("You ordered a burger with all the fixins");
                                break;

                            case 'C':
                            case 'c':
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case 'N':
                            case 'n':
                                System.out.println("You ordered a plain burger");
                                break;
                                
                        }
                    }
                    break;
                // Choice of soda
                case 'S':
                case 's':
                    System.out.println(soda);
                    sodaChoice = scanner.next();
                    if (!(sodaChoice.length() > 1)) {
                        switch (sodaChoice.charAt(0)) {
                            case 'P':
                            case 'p':
                                System.out.println("You ordered Pepsi");
                                break;
                            case 'C':
                            case 'c':
                                System.out.println("You ordered Coke");
                                break;
                            case 'S':
                            case 's':
                                System.out.println("You ordered Sprite");
                                break;
                            case 'M':
                            case 'm':
                                System.out.println("You ordered Mountain Dew");
                                break;
                        }
                    }
                    break;
                // Choice of fries 
                case 'F':
                case 'f':
                    System.out.println(fries);
                    friesChoice = scanner.next();
                    if (!(friesChoice.length() > 1)) {
                        switch (friesChoice.charAt(0)) {
                            case 'L':
                            case 'l':
                                System.out.println("You ordered large fries");
                                break;
                            case 'S':
                            case 's':
                                System.out.println("You ordered small fries");
                                break;
                        }
                    }
                    break;
                // If the user enters a character that is not valid, the following String will be printed
                default:
                    System.out.println("You did not enter any of B, b, S, s, F, or f");

            }
        }
        // if the user enters a String longer than one character, the following String will be printed
        else {
            System.out.println("A single character expected");
        }

    }

}
