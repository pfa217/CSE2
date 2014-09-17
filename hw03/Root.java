import java.util.Scanner;

// Begins Class
public class Root{
    
    // Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Instance of scanner
        // variables
        double num = 0.0;
        double guess = 0.0;
        double sqre = 0.0;
        
        // Input
        System.out.print("Enter a number and I print its cube root: ");
        num = scanner.nextInt();
        
        // Calculations 
        guess = num/3;
        guess = (guess*guess*guess+num)/(3*guess*guess);
        guess = (2*guess*guess*guess+num)/(3*guess*guess);
        guess = (2*guess*guess*guess+num)/(3*guess*guess);
        guess = (2*guess*guess*guess+num)/(3*guess*guess);
        sqre = guess*guess*guess;
        
        // Output
        System.out.println("The cube root is "+guess);
        System.out.println(guess+"*"+guess+"*"+guess+" = "+sqre);
    }
}