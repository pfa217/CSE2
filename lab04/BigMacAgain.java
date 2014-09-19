//// Pablo Aviles
// Lab 04
// Big Mac Again
// The program asks users how many big macs they want and whether they want fries or not

// imports
import java.util.Scanner;

// Start of class
public class BigMacAgain{
    
    // main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double bigMacPrice = 2.22;
        double friesPrice  = 2.15;
        double meal = 0.0;
        String answer = "";
        int nBigMac = 0;
        int nFries = 0;
        
        
        
        System.out.print("Enter the number of Big Macs: ");
        if(scanner.hasNextInt()){
            nBigMac = scanner.nextInt();
            if(nBigMac>0){
                meal = bigMacPrice*nBigMac;
                System.out.println("You ordered "+nBigMac+" big macs for a cost of "+nBigMac+"x"+bigMacPrice+" = "+meal);
                System.out.print("Do you want fries? (Y/y/N/n):");
                answer = scanner.next();
                if(answer.equals("Y") || answer.equals("y")){
                    meal+= friesPrice;
                    System.out.println("You ordered fries at a cost of "+friesPrice);
                    System.out.println("The total price of the meal is "+(int)(meal*100)/100.0);
                } else {
                    if(answer.equals("N") || answer.equals("n")){
                    System.out.println("The total price of the meal is "+meal);
                    } else {
                    System.out.println("You entered a value other than Y, y, N, or n");
                    }
                }
                
            }else {
                System.out.println("You can not enter 0 or less");
                return;
            }
        } else {
            System.out.println("You did not enter an int");
            return;
        }
        
        
    }
}