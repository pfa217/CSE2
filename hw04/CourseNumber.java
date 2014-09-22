//// Pablo Aviles
// Homework 4
// Course Number
// The program reads a course 6 digit number and prints out the semester and year

//imports
import java.util.Scanner;

// Start of class
public class CourseNumber{
    // Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String semester = "";
        int number = 0;
        int nSemester = 0;
        int year = 0;
        
        System.out.print("Enter a six digit number giving the course semester: ");
        number = scanner.nextInt();
        
        year = number/100;
        nSemester = number%year;
        
        if(number>=186510 && number<=201440){
            switch(nSemester){
            case 10:
                semester = "Spring";
                break;
            case 20:
                semester = "Summer 1";
                break;
            case 30:
                semester = "Summer 2";
                break;
            case 40:
                semester = "Fall";
                break;
            default:
                System.out.println(nSemester + " is not a legitimate semester");
                return;
            }
        System.out.println("The course was offered in the "+semester+" of "+year);            
        }
        else {
            System.out.println("The number was outside of range [186510,201440]");
        }
        

        
    }
}