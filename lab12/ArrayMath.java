public class ArrayMath {

    public static void main(String[] args) {
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
                y[] = {2.3, 3, 4, -2.1, 82, 23},
                z[] = {2.3, 13, 14},
                w[] = {2.3, 13, 14, 12},
                v[],
                u[] = {2.3, 12, 14};
        v = addArrays(x, y);
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = "
                + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x)
                + " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z)
                + " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u)
                + " == " + display(z));

    }

    public static String display(double[] x) {
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";

    }

    private static double[] addArrays(double[] x, double[] z) {
        int smallLength;
        int largeLength;
        if(x.length > z.length){ // Get the length of the largest array
            largeLength = x.length;
            smallLength = z.length;
        }else{
            largeLength = z.length;
            smallLength = x.length;
        }
        double[] result = new double[largeLength];
        if(x.length > z.length){ // fill the result array with the values of the largest array
            for(int i = 0; i < largeLength; i++){
                result[i] = x[i];
            }
        }else{
            for(int i = 0; i < largeLength; i++){
                result[i] = z[i];
            }
        }
        
        for(int i = 0; i < largeLength; i++){ // adds both arrays
            if(i < smallLength){ // if the index is smaller than the length of the smallest array
                result[i] = x[i]+z[i]; // it replaces the result with the sum of x and z in that position
            } // if it is not smaller, then the value stays the same 
        }

        return result;
    }

    private static boolean equals(double[] x, double[] y) {
        boolean areEqual = true;

        if (x.length == y.length) { // if they are equal in size
            for (int i = 0; i < x.length; i++) { 
                if (x[i] != y[i]) { // but one of the values is different
                    areEqual = false; // then arrays are not equal
                    break; // break the loop
                }
            }
        } else { // if they are not equal in size
            areEqual = false; // then arrays are not equal
        }

        return areEqual;
    }

}
