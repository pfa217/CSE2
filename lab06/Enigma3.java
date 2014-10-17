import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
        break;
      default:
        n-=3;
        k-=5;
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 *  Because of the missing break statment in after dividing k by 9, the default statement was making k equail to 0.
 *  So at the end of the program 1/k divided by 0, causing the program to crash
 * 
 * 
 * 
 */