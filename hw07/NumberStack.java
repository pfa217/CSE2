/*
Pablo Aviles
Hw 07
Number Stack
The program prints a stack of numbers of the size provided by the user
*/

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Counter variables
        int n = 0;
        int j = 0;
        int k = 0;
        int i = 0;
        int x = 0;
        
        
        System.out.print("Enter a number between 1 and 9: ");
        if (scanner.hasNextInt()) { // Verify user inputs int
            n = scanner.nextInt();

            if (n > 0 && n < 10) { // Verify int is between 0 and 10

                // FOR LOOPS
                for (i = 0; i <= n; i++) {
                    for (k = 0; k < i; k++) {
                        for (x = 0; x < n - i; x++) { // Identation
                            System.out.print(" ");
                        }

                        for (j = 0; j < i + (i - 1); j++) { // number
                            System.out.print(i);
                        }

                        System.out.println(""); // Break line
                    }
                    for (x = 0; x < n - i; x++) { // Identation for dash
                        System.out.print(" ");
                    }
                    for (j = 0; j < i + (i - 1); j++) {
                        System.out.print("-"); // dash
                    }
                    System.out.println("");

                }
//                
                // WHILE LOOPS
                i = 0; // set counter to 0
                while (i <= n) {
                    while (k < i) {
                        while (x < n - i) {
                            System.out.print(" "); // Identation
                            x++;
                        }
                        x = 0;
                        while (j < i + (i - 1)) {
                            System.out.print(i); // number
                            j++;
                        }
                        j = 0;
                        System.out.println(""); // Break line
                        k++;
                    }
                    k = 0;
                    while (x < n - i) {
                        System.out.print(" "); // identation for dash
                        x++;
                    }
                    x = 0;
                    while (j < i + (i - 1)) {
                        System.out.print("-"); // dashes
                        j++;
                    }
                    System.out.println("");
                    j = 0;
                    i++;
                }
                // DO WHILE LOOPS
                i = 0;
                do {
                    i++;
                    do {
                        x = 0;
                        do {
                                System.out.print(" "); // identation
                                x++;
                        } while (x <= n - i);

                        x = 0;
                        do {
                            System.out.print(i); // number
                            j++;
                        } while (j < i + (i - 1));

                        j = 0;
                        System.out.println(""); // break line
                        k++;

                    } while (k < i);

                    k = 0;

                    do {
                        System.out.print(" "); // identation for dash
                        x++;
                    } while (x <= n - i);

                    x = 0;

                    do {
                        System.out.print("-"); // dash
                        j++;
                    } while (j < i + (i - 1));

                    System.out.println("");
                    j = 0;

                } while (i < n);

            } else {
                System.out.println("Number has to be between 1 and 9");
            }
        } else {
            System.out.println("You did not enter an integer");
        }

    }
}
