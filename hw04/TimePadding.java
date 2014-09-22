//// Pablo Aviles
// Homework 4
// Time Padding
// The program promts the user to enter an int for the month and displays the number of days in the month

//Imports
import java.util.Scanner;

public class TimePadding{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour =0;
        int minute =0;
        int second =0;
        int secs = 0;
        int time = 0;
        String minutes = "";
        String seconds = "";
        
        System.out.print("Enter the time in seconds ");
        secs = scanner.nextInt();
        
        hour = secs/3600;
        time = secs%3600;
        minute = time/60;
        time = time%60;
        second = time;
        time = second%60;
        
        
        if(minute<10){
            minutes = "0"+Integer.toString(minute);
        }else{
            minutes = Integer.toString(minute);
        }
        if(second<10){
            seconds = "0"+Integer.toString(second);
        }else{
            seconds = Integer.toString(second);
        }
        
        System.out.println("The time is  "+hour +" : "+minutes+" : "+seconds);
    }
}