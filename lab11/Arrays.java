import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int Z = 10;
        int[] a = new int[Z];
        int[] b = new int[Z];
        int min =0;
        int max =0;
        int sum =0;
        int y = 9;
        
        System.out.print("Enter 10 ints: ");
        for(int x = 0; x < Z; x++){
            a[x] = scan.nextInt();
        }
        
        for(int x = 0; x < Z; x++){
            if(a[x] > max){
                max = a[x];
            }
        }
        min = max;
        
        for(int x = 0; x < Z; x++){
            if(a[x] < min){
                min = a[x];
            }
        }
        
        for(int x= 0; x < Z; x++){
            sum += a[x];
        }
        
        for(int x = 0; x < Z; x++, y--){
            b[y] = a[x];
        }
        
        String txt = "The lowest entry is "+min+"\n"+
                        "The highest entry is "+max+"\n"+
                        "The sum is " + sum;
        System.out.println(txt);
        
        for(int x = 0; x < Z; x++){
            System.out.print(a[x]+"\t");
            System.out.println(b[x]);
        }
        
        
        
        
    }
}