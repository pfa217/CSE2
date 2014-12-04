/*
Pablo Aviles
Hw 11
The program builds a 3d array, displays it, and then sorts the elements in the 3rd slab
*/
public class MatrixSorter {

    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "
                + findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

    public static int[][][] buildMat3d() { // method builds the array
        int[][][] array = new int[3][][];
        int row = 1;

        for (int s = 0; s < 3; s++) {
            array[s] = new int[3 + 2 * (s)][];
            for (int i = 0; i < array[s].length; i++) {
                array[s][i] = new int[row + i]; // builds a ragged array
            }
            row++;
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                for (int j = 0; j < array[i][k].length; j++) {
                    array[i][k][j] = (int) (1 + (99 * Math.random())); // fills the array with random numbers from 1 to 99
                }
            }
        }

        return array;
    }

    public static void show(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" -------------------- Slab " + (i + 1)); // displays the array separating each slab
            for (int k = 0; k < array[i].length; k++) {
                for (int j = 0; j < array[i][k].length; j++) {
                    System.out.print(array[i][k][j] + " ");
                }
                System.out.println("");
            }

        }
        System.out.println(" --------------------");
    }

    public static int findMin(int[][][] array) {
        int min = array[0][0][0]; // finds the minimum value in the 3d array

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                for (int j = 0; j < array[i][k].length; j++) {
                    if (array[i][k][j] < min) {
                        min = array[i][k][j];
                    }
                }
            }
        }
        return min;
    }
    
    public static void sort(int [][] array){ // sorts the 2d array using insertion sort
        int[] temp;
        
        for (int i = 0; i < array.length; i++) {
            sort(array[i]); // sorts each row of the 2d array calling an overloaded method
        }
        for(int i = 1; i < array.length; i++){ 
            int current = array[i][0];
            temp = new int[array[i].length];
            int k;
            for(k = i-1; k>=0 && array[k][0] > current; k--){ // loops until k is 0 or the first value of the array is in the correct position
                temp = array[k+1];
                array[k+1] = array[k];
                array[k] = temp;
            }
        }
    }

    public static void sort(int[] array) { // overloaded method for sorting each row of the array
        int a;
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            a = 0;
            for (int k = 1; k <= i; k++) {
                if (array[k] > array[a]) {
                    a = k;
                }
            }
            temp = array[a];
            array[a] = array[i];
            array[i] = temp;
        }
    }

}
