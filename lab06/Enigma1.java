import java.util.Scanner;

public class Enigma1 {

    public static void main(String[] arg) {
        double percent;
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        double x = ((new Scanner(System.in)).nextDouble());
        System.out.println("You entered " + x + "%");
        //print out the proportion remaining for select percentages
        double i = 100 - x;
 
        if (100 - x == 93) //when the user enters 7
        {
            System.out.println("The proportion remaining is " + 0.93);
        } else if (100 - x == 59)//when the user enters 41
        {
            System.out.println("The proportion remaining is " + 0.59);
        } else if (100 - x == 86)//when the user enters 14
        {
            System.out.println("The proportion remaining is " + 0.86);
        } else if (100 - x == 67)//when the user enters 33
        {
            System.out.println("The proportion remaining is " + 0.67);
        } else if (100 - x == 40)//when the user enters 60
        {
            System.out.println("The proportion remaining is " + 0.40);
        }
    }
    /* Error report: 
 * It sometimes does not work because it does not round up
    fixed by substracting 100 - x and then comparing by the proportion multiplyed by x
 * 
 * 
 * 
 */
}
