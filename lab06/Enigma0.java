import java.util.Scanner;

public class Enigma0 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter an int- ");

        if (scan.hasNextInt()) {
            n = scan.nextInt();
            System.out.println("You entered " + n);
        } else {
            System.out.println("You did not enter an int");
            return;
        }

        int k = 4, p = 6, q = 7, r = 8;
        switch (k + p + q + r) {
            case 24:
            case 25:
                System.out.println("sum is 25");
            default:
                System.out.println("Again, you entered " + n);
        }
    }
}

/* Error report:
1. variable n was declared inside the if, and then declared again. It can be declared once at the beginning
2. When entering something other than an int it printed 4
 */