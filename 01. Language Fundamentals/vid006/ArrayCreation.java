public class ArrayCreation {
    public static void main(String[] args) {
        int[] a=new int[3];
        System.out.println(a.getClass().getName());

        int[] b[]=new int[3][2];
        System.out.println(b.getClass().getName());

        int[][][] c[]=new int[3][2][1][3];
        System.out.println(c.getClass().getName());

        boolean[] d=new boolean[3];
        System.out.println(d.getClass().getName());


        // Array with size zero
        int[] o=new int[0];
        System.out.println(o);

        // int[] p=new int[-3];           //Runtime exception
        // int[] q=new int[3.3];              //Compiletime errror

        int[] r=new int['a'];              // won't give the error because it got converted into the ascii value implictly

        // int[] s=new int[10l];             // can't specify the size in long type.

        // int[] t=new int[2147483648];         // Compile time error: integer number too large.
    }
}
