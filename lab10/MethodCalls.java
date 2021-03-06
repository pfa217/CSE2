/*
Pablo Aviles
Lab 10
Methods 
The lab calls methods that concatenate numbers together
*/
public class MethodCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int join(int a, int b){ // concatenates a to b
        if(a<0){ // gets rid of the negative sign
            a = a*-1;
        }
        if(b<0){
            b = b*-1;
        }
        
        String tx = "";
        tx += a;
        tx += b;
        int num = 0;
        num = Integer.parseInt(tx);
        return num;
    }
    
    public static int addDigit(int a, int b){ // concatenates b to a
        int num = 0;
        num = join(b, a);
        if(a < 0 || b < 0){
            num *= -1;
        }
        
        return num;
    }
}
