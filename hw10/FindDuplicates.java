import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            } else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            } else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }

    public static boolean hasDups(int[] num) {
        boolean hasDup = false;

        for (int x = 0; x < num.length; x++) {
            for (int y = x+1; y < num.length; y++) { 
                if (num[x] == num[y]) { // if the number us duplicated
                    hasDup = true; // the array has a duplicate
                }
            }
        }

        return hasDup;
    }

    public static boolean exactlyOneDup(int[] num) {

        boolean hasDuplicates = false;
        boolean hasExOneDuplicate = false;
        boolean hasMoreDuplicates = false;

        for (int x = 0; x < num.length; x++) {
            for (int y = x+1; y < num.length; y++) {
                if (hasDuplicates && num[x] == num[y]) { // if it was already duplicated and it is duplicated again
                    hasMoreDuplicates = true; // then it has more duplicates
                } else { // if it was not yet duplicated
                    if (num[x] == num[y]) { // and it has a duplicate
                        hasDuplicates = true;  // then it is duplicated
                    }
                }

            }
        }

        if (hasDuplicates && hasMoreDuplicates==false) { // if it was duplicated and it has no more than one duplicate
            hasExOneDuplicate = true; // then it has one duplicate
        }

        return hasExOneDuplicate;
    }
}