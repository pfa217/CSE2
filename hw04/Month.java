//// Pablo Aviles
// Homework 4
// Month
// The program promts the user to enter an int for the month and displays the number of days in the month
//Import
import java.util.Scanner;

// Class
public class Month {
    // main method
    public static void main(String [] args){
        // variables 
        Scanner scanner = new Scanner(System.in); // instance of scanner
        int month = 0;
        int days = 0;
        int year = 0;
        
        // Prompts user to enter a month 
        System.out.print("Enter a number giving a int for a month: ");
        month = scanner.nextInt();
        
        // Conditions for each month
        switch(month){
            case 1: 
                days = 31;
                break;
            case 2:
                System.out.print("Enter an int giving the year: ");
                year = scanner.nextInt();
                // February has 29 days if the year is divisible by 4. Years divisible by 100 but not by 400 have 28 days 
                if(year%4 == 0){
                    if(!(year%100 == 0 && year%400!=0)){
                        days = 29;
                    }
                    else {
                        days = 28;    
                    }
                } 
                else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4: 
                days = 30;
                break;
            case 5: 
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11: 
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("You did not enter a number between 1 and 12");
                return;
        }
        
        // Output
        System.out.println("The month has "+days+" days");

    }
}

