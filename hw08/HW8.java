import java.util.Scanner;

public class HW8 {

    public static void main(String[] args) {

        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        while (input == 'x' || input == 'l') {
            if (input == 'x') {
                System.out.print("You did not enter a character from the list 'Cc'; try again- ");
                input = getInput(scan, "Cc");
            } else {
                if (input == 'l') {
                    System.out.print("You should enter exactly one character- ");
                    input = getInput(scan, "Cc");
                }
            }
        }

        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");

    }

    public static char getInput(Scanner scan, String list) {
        String in = scan.next();
        if (in.length() > 1) {
            return 'l';
        }

        for (int i = 0; i < list.length(); i++) {
            for (int k = 0; k < in.length(); k++) {
                if (list.charAt(i) == in.charAt(k)) {
                    return in.charAt(k);
                }
            }
        }
        return 'x';
    }

    public static char getInput(Scanner scan, String list, int attempts) {
        String in = scan.next();
        char ch = ' ';

        for (int i = 0; i < attempts; i++) {
            for (int x = 0; x < list.length(); x++) {
                if (in.charAt(0) == list.charAt(x)) {
                    ch = in.charAt(0);
                }
            }
            if (ch != ' ') {
                return ch;
            } else {
                System.out.print("You did not enter a character from the list 'yYnN' try again- ");
                in = scan.next();
            }
        }
        System.out.println("You failed after " + attempts + " tries");
        return ' ';
    }

    public static char getInput(Scanner scan, String prompt, String string) {
        
        String input = "";
        boolean valid = false;
        char ch = ' ';
        
        do{
            System.out.print(prompt);
            input = scan.next();
            for(int i = 0; i < string.length(); i++){
                if(input.charAt(0) == string.charAt(i)){
                    valid = true;
                    ch = string.charAt(i);
                }
            }
        } while(input.length()>1 || valid == false);
        
        
        
        return ch;
    }

}
