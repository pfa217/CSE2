// Pablo Aviles
// Homework 2
// Homework 2
// Cyclometer
 
// Class definition
public class Cyclometer{
    
    // main method
    public static void main(String[] args){
        
        // variables
        int secsTrip1=480; // number of seconds for trip 1
        int secsTrip2=3220; // number of seconds for trip 2
        int countsTrip1 = 1561; // Number of counts for trip 1 
        int countsTrip2 = 9037; // Number of countr for trip 2
        double wheelDiameter = 27.0, // Diameter of the wheel
        PI=3.14159, // value of pi
        feetPerMile = 5280, // Feet per mile
        inchesPerFoot = 12, // Inches per foot
        secondsPerMinute = 60; // Seconds per minute
        double distanceTrip1 = 0.0; 
        double distanceTrip2 = 0.0; 
        double totalDistance = 0.0;
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1 + " counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2 + " counts.");
        
        // Calculations
        distanceTrip1 = countsTrip1*wheelDiameter*PI; // calculating distance for trip 1 in inches
        distanceTrip1 /= inchesPerFoot*feetPerMile; // gives distance in miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;  // calculating distance for trip 2 in miles
        totalDistance = distanceTrip1+distanceTrip2;   // calculate total distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); // Prints out the output data of trip 1 in miles
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); // prints out the distance of trip 2 in miles
        System.out.println("The total distance was "+totalDistance+" miles"); // prints out the total distance 
        
    }
}