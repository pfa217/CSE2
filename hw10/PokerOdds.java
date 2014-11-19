import java.util.Random;
import java.util.Scanner;

public class PokerOdds {

    public static void main(String[] arg) { // Main method
        showHands();
        simulateOdds();
    }

    public static void showHands() {
        Scanner scan = new Scanner(System.in);
        String[] labels = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"}; // String array for the labels of each card
        String clubs, diamonds, hearts, spades; // Strings for printing each Suit
        String again = "";
        int[] deck = new int[51];
        int[] hand = new int[5];

        for (int i = 0; i < hand.length; i++) { // for loop initializes the hand with -1
            hand[i] = -1;
        }
        for (int i = 0; i < deck.length; i++) { // initializes the deck
            deck[i] = i;
        }

        do {
            clubs = "Clubs: "; // Reset the strings
            diamonds = "Diamonds: ";
            hearts = "Hearts: ";
            spades = "Spades: ";
            for (int i = 0; i < hand.length; i++) { // Get 5 random cards
                int target = (int) ((deck.length - i) * Math.random());
                int temp = deck[target];
                while (temp == -1) {
                    target = (int) ((deck.length - i) * Math.random());
                    temp = deck[target];
                }
                deck[target] = hand[i];
                hand[i] = temp;
            }

            for (int i = 0; i < hand.length; i++) { // gives each card a suit and a rank
                int suit = hand[i] / 13;
                int rank = hand[i] % 12;
                switch (suit) {
                    case 0:
                        clubs += labels[rank] + " ";
                        break;
                    case 1:
                        diamonds += labels[rank] + " ";
                        break;
                    case 2:
                        hearts += labels[rank] + " ";
                        break;
                    case 3:
                        spades += labels[rank] + " ";
                        break;
                }
            }
            
            
            //output
            System.out.println(clubs);
            System.out.println(diamonds);
            System.out.println(hearts);
            System.out.println(spades + "\n");

            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit: ");
            again = scan.next();

        } while (again.equalsIgnoreCase("y"));

    }
    
    
    public static void simulateOdds() {
        // variables and arrays
        String out="Rank\tFreq of exactly one pair\n";
        String[] labels = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        int[] frequency = new int[12];
        int[] deck = new int[51];
        int[] hand = new int[5];
        int notExactlyOne =0;
        
        
        // initialize both deck and hand
        for (int i = 0; i < hand.length; i++) {
            hand[i] = -1;
        }
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int x = 0; x < 10000; x++) { // runs the simulation 10000 times
            for (int i = 0; i < hand.length; i++) { // Get 5 random cards
                int target = (int) ((deck.length - i) * Math.random());
                int temp = deck[target];
                while (temp == -1) {
                    target = (int) ((deck.length - i) * Math.random());
                    temp = deck[target];
                }
                deck[target] = hand[i];
                hand[i] = temp;
            }

            for (int j = 0; j < hand.length; j++) { // change the hand number for a rank
                int temp = hand[j];
                temp = temp % 12;
                hand[j] = temp;
            }
            
            if (FindDuplicates.exactlyOneDup(hand)) { // verify that it has exactly one pair
                for(int i = 0; i < hand.length; i++){
                    for(int k = i+1; k < hand.length; k++){
                        if(hand[k] == hand[i]){
                            frequency[hand[k]]++;
                        }
                    }
                }
            }else{
                notExactlyOne++; // if not add one to notExactlyOne
            }
        }
        
        // Output
        for(int x = 0; x < frequency.length; x++){
            out+= labels[x] + "\t" + frequency[x] + "\n";
        }
        out+= "----------------------\n";
        out+= "total not exacly one pair: "+notExactlyOne;
        
        
        System.out.println(out);
        

    }
}