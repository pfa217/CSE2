//// Pablo Aviles
// lab 3
// Big mac calculates the cost of big macs plus tax
import java.util.Scanner;

// Big Mac Class
public class BigMac{
    
    // Main method
    public static void main(String[] args){
        
        // variables
        Scanner myScanner; // instance of Scanner
        myScanner = new Scanner(System.in); // intialize scanner instance
        double cost$ = 0.0;
        int dollars = 0;
        int dimes = 0;
        int pennies = 0;
        
        // input for number of big macs
        System.out.print("Enter the number of Big Macs (an integer>0): ");
        int nBigMacs = myScanner.nextInt();
        
        // input for price per big mac
        System.out.print("Enter the cost per big mac as a double (in the form xx.xx): ");
        double bigmac$ = myScanner.nextDouble();
        
        // input for tax percentage 
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;
        
        // calculations
        cost$ = nBigMacs*bigmac$*(1+taxRate);
        dollars = (int)cost$;
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        
        // output
        System.out.println("The total cost of "+nBigMacs
        +" BigMacs, at $"+bigmac$+" per bigMac, with a sales tax of "
        + (int)(taxRate*100)+"%, is $"+dollars+("."+dimes)+pennies);
        
        
        
    }
}