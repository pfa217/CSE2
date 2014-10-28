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
        /*    num=scan.nextInt();
            
            if(!scan.hasNextInt()){
                System.out.println("try again");
                num=scan.nextInt();
                //continue;
                
            }*/


        //num=scan.nextInt();



        boolean flag;
    //    do {
            // flag == false;
            flag = false;

            while (flag == false) {
                if (scan.hasNextInt()) {
                    num = scan.nextInt();
                    flag = true;
                }
                else {
                    System.out.println("You did not enter an int");
                    continue;
                }

            }



            //return num;
   //     } while (!scan.hasNextInt());

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
