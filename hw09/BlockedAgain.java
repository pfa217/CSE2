import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        String in = "";
        int num = 0;
        boolean isInt = false;
        boolean inRange = false;

        System.out.print("Enter an int between 1 and 9, inclusive: ");
        isInt = checkInt(scanner);
        num = scanner.nextInt();

        //isInt = checkInt(num);
        inRange = checkRange(num);

        while (!(isInt && inRange)) {
            inRange = checkRange(num);
            if (!inRange) {
                System.out.print("You did not enter an int in [1,9]; try again: ");
                isInt = checkInt(scanner);
                num = scanner.nextInt();
            }
        }

        return num;
    }

    public static boolean checkInt(Scanner scan) {
        int n = 0;
        while (!scan.hasNextInt()) {
            System.out.print("You did not enter an int; try again: ");
            scan.next();
        }
        return true;
    }

    public static boolean checkRange(int a) {
        if (a < 10 && a > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void allBlocks(int a) {
        int i;
        for (i = 0; i <= a; i++) {
            block(i, a);
        }
    }

    public static void block(int i, int a) {
        int k;
        int x;
        int j;

        for (k = 0; k < i; k++) {
            for (x = 0; x < a - i; x++) {
                System.out.print(" ");
            }
            for (j = 0; j < i + (i - 1); j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        line(a, i);
        System.out.println("");

    }

    public static void line(int a, int i) {
        int x;
        int j;

        for (x = 0; x < a - i; x++) {
            System.out.print(" ");
        }
        for (j = 0; j < i + (i - 1); j++) {
            System.out.print("-");
        }
    }

}