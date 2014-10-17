import java.util.Scanner;

public class Enigma2{
  public static void main(String [] args){
    int n=40,k=60;
    int out=0;
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 *  1. Case 40 divides by 0, causing a runtime error
 *  2. Out is a string, the program was not adding, it was concatenating
 * 
 */
