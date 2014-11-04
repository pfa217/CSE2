import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c + " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");
    }

    public static int getInt(Scanner scan) {
        int num = 0;
        while(!scan.hasNextInt()){
            System.out.print("You did not enter an int; try again: ");
            scan.next();
        }
        num = scan.nextInt();
        return num;
    }

    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static boolean ascending(int a, int b, int c) {
        return a < b && b < c;
    }

}
