/*
Pablo Aviles
Hw 06
Roulette
The program simulates a roulette game played 1000 times where the user bets 1 dollar. 
The program will print the money earned, the amount of times the user earned money, and the amount of times that the user lost everything
*/

public class Roulette {

    public static void main(String[] args) {

        int numberChosen = (int) (1 + Math.random() * 38); // User chooses a random number
        int numberComesUp = 0;
        int spins;
        int rouletteNum = 0;
        int moneyEarned = 0;
        int timesWalkedAwayWMoney = 0;
        int timesLost = 0;

            for (int j = 0; j < 1000; j++) { // User plays 1000 times
                for (spins = 0; spins < 100; spins++) { // user spins 100 times 
                    if (numberChosen == (int) (1 + Math.random() * 38)) { // if the user chooses the right number, numberComesUp is added 1
                        numberComesUp++;
                    }
                }
                if (numberComesUp >= 3) { // if the number came up 3 or more times the user earns the money
                    moneyEarned += numberComesUp*36;
                    timesWalkedAwayWMoney++;
                } else { // if not, the user lose money
                    timesLost++;
                    moneyEarned += numberComesUp*36;
                }
                numberComesUp =0;
            }
        
        // output
        System.out.println("Total Earnings: " + moneyEarned + "\n" +
                            "Times you walked away with money: " +timesWalkedAwayWMoney +"\n" +
                            "Times you lost money: "+timesLost);

    }

}
