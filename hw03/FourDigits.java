import java.util.Scanner;

// Start of class
public class FourDigits {
    
    // main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Declare instance of scanner
        // Variables
        double num = 0.0;
        int num2 = 0;
        int num3 = 0;
        int n1 = ' ';
        int n2 = ' ';
        int n3 = ' ';
        int n4 = ' ';
        
        // Input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        num = scanner.nextDouble();
        num2 = (int)num; // Cast num into another variable
        
      
        num = num-num2; // Substract the number to leave decimals only

        // Save 1 character into each variable
        num = num * 10000;
        num3 = (int)num;
        n1 = num3/1000;
        num3 %= 1000;
        n2 = num3/100;
        num3 %= 100;
        n3 = num3/10;
        num3 %= 10;
        n4 = num3;
        
        // output
        System.out.println("The four digits are :"+n1 +""+n2+""+n3+""+n4);
    }
}    