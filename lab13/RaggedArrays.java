public class RaggedArrays {

    public static void main(String[] args) {

        int[][] a = new int[5][];

        for (int i = 0; i < 5; i++) {
            a[i] = new int[(i * 3) + 5];
        }
        int min = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = (int) (40 * Math.random());
            }
        }
        
        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            aux = a[i][0];
            for (int k = 0; k < a[i].length; k++) {
                for(int j = 0; j < a[i].length; j++){
                    if(a[i][k] < a[i][j]){
                        aux = a[i][k];
                        a[i][k] = a[i][j];
                        a[i][j] = aux;
                    }
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println("");
        }

    }

}