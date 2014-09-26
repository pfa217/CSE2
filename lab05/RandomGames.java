//// Pablo Aviles
// Lab 04
// Random Games
// The program asks users for a game to play. The options are craps, roulette, or Picking a card from a deck

// import
import java.util.Scanner;


// begin class
public class RandomGames {
    
    // main method
    public static void main (String[] args){
        
        // variables
        Scanner scanner = new Scanner(System.in);
        String input = "";
        char x = ' ';
        int roulette = 0;
        
        // input
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        input = scanner.next();

        if (!(input.length() > 1)) { // if statement verifies that the user entered one character onlu
            x = input.charAt(0);
            
            switch(x){
                case 'R':
                    roulette = (int)(Math.random()*37)+1;
                    switch(roulette){ // Roulette
                        case 37: // when the user enters R or r
                            System.out.println("Roulette: 00");
                            break;
                        default:
                            System.out.println("Roulette " +roulette);
                    }
                    break;
                case 'r':
                    roulette = (int)(Math.random()*37)+1;
                    switch(roulette){ // Roulette
                        case 37:
                            System.out.println("Roulette: 00");
                            break;
                        default:
                            System.out.println("Roulette " +roulette);
                    }
                    break;
                case 'C': // when user enters C
                    System.out.println("Craps option is not yet implemented"); // Game is not yet implemented
                    break;
                    
                case 'c': // when user enters c
                    System.out.println("Craps option is not yet implemented"); // Game is not yet implemented
                    break;
                    
                case 'P': // when user enters P
                    System.out.println("Picking a card is not yet implemented"); // game is not yet implemented
                    break;
                
                case 'p': // when user enters p
                    System.out.println("Picking a card is not yet implemented"); // game is not yet implemented
                    break;
                    
                default:
                    System.out.println("'" + x + "'" + " is not one of 'R', 'r', 'C', 'c', 'P', or 'p' "); // any other character will print this String
                    
            }
            
        }
        else {
            System.out.println("A single character expected"); // if the input is longer than 1 character, this String will be printed
        }
    }
}
