public class ExtraCredit {

    public static void main(String[] args) {
        int i = 0;
        String word = "A";
        for (i = 0; i < 4; i++) {
            word = A(A(word, i));
            System.out.println(
                    "v:  " + word
            );
        }
    }
    
    public static String A(String a){
        String front = "";
        String back = "";
        
        front = " "+a;
        back = front+"a";
        
        return back;
    }
    
    public static String A(String a, int i){
        String front = "";
        String back = "";
        
        front = i+" "+a;
        back = front+"a";
        
        return back;
    }
}