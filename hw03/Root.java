import java.util.Scanner;

public class Root{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num = 0.0;
        double guess = 0.0;
        double sqre = 0.0;

        System.out.print("Enter a number and I print its cube root: ");
        num = scanner.nextInt();
        
        guess = num/3;
        guess = (guess*guess*guess+num)/(3*guess*guess);
        guess = (2*guess*guess*guess+num)/(3*guess*guess);
        guess = (2*guess*guess*guess+num)/(3*guess*guess);
        guess = (2*guess*guess*guess+num)/(3*guess*guess);
    //    root2 = (root1*root1*root1+num)/(3*root1*root1);
      //  root3 = (root2*root2*root2+num)/(3*root2*root2);
        //root4 = (root3*root3*root3+num)/(3*root3*root3);
    //    root5 = (root4*root4*root4+num)/(3*root4*root4);
     //   root6 = (root5*root5*root5+num)/(3*root5*root5);
        sqre = guess*guess*guess;
        
        System.out.println("The cube root is "+guess);
        System.out.println(guess+"*"+guess+"*"+guess+" = "+sqre);
    }
}