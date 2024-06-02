package vid9;

public class Array_Var_Assignment {
    public static void main(String[] args) {
        int[] i = { 1, 2, 3, 4, 5 };
        char[] c = { 'a', 'b', 'c', 'd', 'e' };

        int[] a = i;
        // int[] b=c; //incompatibility. will give error

        // In the case of object type arrays, child class type arrays can be promoted to
        // the parent class type arrays.
        String[] s = { "a", "b", "c" };
        Object[] o = s;

        int[] j = { 1, 2, 3, 4, 5 };
        // Number[] n=j; //incompatibility. will give error

        // Array type with the dimension should be matched, does not matter what size
        // they have.
        int[][] p = new int[3][];
        p[0] = new int[8];
        // p[1] = 10;                   //Will give the error 
        // p[2] = new int[2][3];        //will give the error

    }
}
