//// Pablo Aviles
// Homework 1
// Bicycle
// The program receives number of seconds and counts from the user and prints distance, time, and speed

import java.util.Scanner;

// Begin class
public class Bicycle{
    
    // main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declare instance of Scanner class
        //variables
        int seconds = 0;
        int counts = 0;
        double time2 = 0;
        double time = 0.0;
        double PI = 3.14159;
        double feetPerMile = 5280; // Feet per mile
        double inchesPerFoot = 12; // Inches per foot
        double diameter = 27.0;
        double mph = 0.0;
        double distance = 0.0;
        
        // input
        System.out.print("Enter the number of seconds: ");
        seconds = scanner.nextInt();
        
        System.out.print("Enter the number of counts: ");
        counts = scanner.nextInt();
        
        // Calculations
        distance = counts*diameter*PI;
        distance/=inchesPerFoot*feetPerMile;
        distance = (int)(distance*100)/100.0;
        time = seconds/60;
        time2 = time/60;
        mph = distance/time2;
        mph = ((int)(mph*100)/100.0);
        
        // output
        System.out.println("The distance was "+ distance + " miles and took "+ time+ " minutes");
        System.out.println("The average mph was "+mph);
    } // end of Main method
} // end of class