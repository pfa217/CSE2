/*
Pablo Aviles
Hw 11
The program asks user for a hand of poker and displays what type of hand it is
*/
import java.util.Scanner;

public class PokerHands {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean flush = false;
        boolean otherPairOrFull = false;
        boolean notEntered = false;
        boolean handHasSomething = false;
        boolean thereIsNo0 = true;
        int[] hand = new int[5];
        int[] deck = new int[51];
        int[] frequencyOfRanks = new int[13];
        int highCard = 14;
        int suitNum = 0;
        int temp = 0;
        int rankNum = 0;
        int countOnes = 0;
        int countC = 0;
        int countD = 0;
        int countH = 0;
        int countS = 0;
        String suit;
        String rank = "";
        String cont = "";
    
        // give the deck numbers
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        
        
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand - ");
        cont = scanner.next();
        while (cont.equalsIgnoreCase("y")) {
            // fill frequency with 0
            for (int i = 0; i < frequencyOfRanks.length; i++) {
                frequencyOfRanks[i] = 0;
            }
            for (int k = 0; k < 5; k++) {
                do {
                    do {
                        System.out.print("Enter a suit: 'c', 'd', 'h', or 's' - ");
                        suit = scanner.next(); // ask user for a suit
                        switch (suit) {
                            case "c":
                                suitNum = 0;
                                countC++;
                                break;
                            case "d":
                                suitNum = 1;
                                countD++;
                                break;
                            case "h":
                                suitNum = 2;
                                countH++;
                                break;
                            case "s":
                                suitNum = 3;
                                countS++;
                                break;
                            default:
                                System.out.println("You did not enter a valid response");
                        }
                    } while (!(suit.equals("c") || suit.equals("s") || suit.equals("h") || suit.equals("d")));

                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2' - ");
                    rank = scanner.next();
                    switch (rank) {
                        case "a":
                            rankNum = 0;
                            break;
                        case "k":
                            rankNum = 1;
                            break;
                        case "q":
                            rankNum = 2;
                            break;
                        case "j":
                            rankNum = 3;
                            break;
                        case "10":
                            rankNum = 4;
                            break;
                        case "9":
                            rankNum = 5;
                            break;
                        case "8":
                            rankNum = 6;
                            break;
                        case "7":
                            rankNum = 7;
                            break;
                        case "6":
                            rankNum = 8;
                            break;
                        case "5":
                            rankNum = 9;
                            break;
                        case "4":
                            rankNum = 10;
                            break;
                        case "3":
                            rankNum = 11;
                            break;
                        case "2":
                            rankNum = 12;
                            break;
                        default:
                            System.out.println("You did not enter a valid response");
                    }

                    for (int i = 0; i < hand.length; i++) {
                        if (suitNum == hand[i] / 13 && rankNum == hand[i] % 13) { // this will make sure the card has not been entered yet
                            System.out.println("You already entered that card");
                            notEntered = true;
                        }
                    }
                    for (int i = 0; i < deck.length; i++) {
                        if (suitNum == deck[i] / 13 && rankNum == deck[i] % 13) { // this will look for the value of the card and add it to the hand
                            temp = deck[i];
                            deck[i] = -1;
                            hand[k] = temp;
                            notEntered = false;
                        }
                    }
                } while (notEntered);
            }
            showOneHand(hand);

            for (int i = 0; i < hand.length; i++) {
                frequencyOfRanks[hand[i] % 13]++; // this will add the ranks to the frequency of ranks array
            }

            for (int i = 0; i < hand.length; i++) {
                if (countC == 5 || countD == 5 || countH == 5 || countS == 5) { // if all cards have the same suit then variable flush is true
                    flush = true;
                }
            }

            for (int i = 0; i < frequencyOfRanks.length; i++) {
                if (frequencyOfRanks[i] == 1 && thereIsNo0) { // if the frequency is one and there is no 0 in between
                    for (int k = 1; k <= 4; k++) {
                        if (frequencyOfRanks[i + k] == 1) {
                            countOnes++; // count the number of consecutive ones
                        } else {
                            thereIsNo0 = false;
                            break;

                        }
                    }
                    if (countOnes >= 5) { // if it has 5 consecutive ones
                        if (flush) { //and it is a flush
                            if (i == 0) { // and starts with A
                                System.out.println("This is a Royal Flush \n"); // there is a royal flush
                                handHasSomething = true;
                                break;
                            } else { // if it doesnt start with A
                                System.out.println("This is a Flush"); // there is a flush
                                handHasSomething = true;
                                break;
                            }
                        } else { // if it is not a flush
                            System.out.println("This is a straight"); // then it is a straight
                            handHasSomething = true;
                            break;
                        }

                    }
                }
                if (frequencyOfRanks[i] == 2) { // if you have a rank repeted 2 times
                    for (int k = i + 1; k < frequencyOfRanks.length; k++) {
                        if (frequencyOfRanks[k] == 3) { // and a rank repeated 3 times after
                            System.out.println("This is a full house"); // there is a full house
                            handHasSomething = true;
                            otherPairOrFull = true;
                            break;

                        } else { // if one is not repeated 3 times
                            if (frequencyOfRanks[k] == 2) { // but there is one repeated 2 times
                                System.out.println("This is a two pair"); // there are 2 pairs
                                handHasSomething = true;
                                otherPairOrFull = true;
                                break;
                            }
                        }
                    }
                    if (otherPairOrFull == false) { // if there is no other pair or a full house
                        System.out.println("This is a one pair"); // there is only one pair
                        handHasSomething = true;
                    }
                    break;
                } else {
                    if (frequencyOfRanks[i] == 4) {
                        System.out.println("This is four of a kind"); // if a rank is repeated 4 times, there is a four of a kind
                        handHasSomething = true;
                    } else {
                        if (frequencyOfRanks[i] == 3) { // inversed process of looking for a full house
                            for (int k = i + 1; k < frequencyOfRanks.length; k++) {
                                if (frequencyOfRanks[k] == 2) {
                                    System.out.println("This is a full house");
                                    handHasSomething = true;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }

            }
            if (handHasSomething == false) {
                System.out.println("This is high card"); // if there is no rank in the hand, then it is measured by the highest card
            }

            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand - ");
            cont = scanner.next();

        }
    }

    public static void showOneHand(int hand[]) {
        String suit[] = {"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "};
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++) {
                for (int card = 0; card < 5; card++) {
                    if (hand[card] / 13 == s && hand[card] % 13 == rank) {
                        out += face[rank];
                    }
                }
            }
            out += '\n';
        }
        System.out.println(out);
    }

}
