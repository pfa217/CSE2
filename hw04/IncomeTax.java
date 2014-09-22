//// Pablo Aviles
// Homework 4
// Income Tax
// The program promts the user to enter an int and writes out the amount of tax on the number provided

//Import
import java.util.Scanner;

// Class
public class IncomeTax {
    // main method
    public static void main(String [] args){
        // variables 
        Scanner scanner = new Scanner(System.in); // instance of scanner
        int num = 0;
        int thou = 0;
        double tax =0.0;
        double taxRate = 0.0;
        
        System.out.print("Enter an int giving the number of thousands: ");
        num = scanner.nextInt();
        
        if(num<20 && num>0){
            tax*=num*0.05;
            taxRate = 5.0;
        } else {
            if(num>=20 && num<40){
            tax = num*0.07;
            taxRate = 7.0;
            }else {
                if(num>=40 && num<78){
                tax = num*0.12;
                taxRate = 12.0;
                } else {
                    if(num>78){
                        tax = num*0.14;
                        taxRate = 14.0;
                    } else {
                        System.out.println("You did not enter a positive number");
                    }
                }  
            }
        }
        thou = num*1000;
        tax*=1000;
        tax = (int)(tax*100)/100.0;
        System.out.println("The tax rate on $"+thou+ " is "+taxRate+"%, and the tax is $"+tax);
        
    }
}

