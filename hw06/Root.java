/*
Pablo Aviles
Hw 06
Root
The program prints the square root of a number given by the user
*/

import java.util.Scanner;
public class Root {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        System.out.print("Enter a number greater than 0: ");
        x = scanner.nextDouble(); // user enters a number

        double high = x + 1; // high is the number plus 1
        double low = 0; // low is 0
        double mid = (high + low) / 2; // mid is in between high and low
 
        if (x > 0) {
            while (!((high - low) < 0.0000001 * high)) { // keeps repeting the loop if the difference between high and low is greater than a small multple of mid
                if ((mid * mid) > x) { // if square of mids is greater than one
                    high = mid; // high is mid
                    mid = (high + low) / 2; // mid is betwen high and low
                } else { // if not
                    low = mid; // low is mid
                    mid = (high + low) / 2; // mid is between high and low
                }
            }
        } else {
            System.out.println("Number has to be greater than 0"); // print this if number is less than 0
            return;
        }

        System.out.println("Square root is "+mid); // print the square root of the number

    }

}
