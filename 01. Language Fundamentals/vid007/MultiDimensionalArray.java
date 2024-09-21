public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Atleast we have to define the base array size.
        // Two Dimensional array
        int[][] d = new int[2][];
        d[0] = new int[2];
        d[1] = new int[3];

        // Three Dimensional Array
        int[][][] x = new int[2][][];
        x[0] = new int[3][];
        x[0][0] = new int[1];
        x[0][1] = new int[2];
        x[0][0] = new int[3];

        x[1] = new int[2][2];

        // Checking the validity of the below array
        // int[][][] z=new int [2][][4]; // It will give the compile time error.
    }
}
