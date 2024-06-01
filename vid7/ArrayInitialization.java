public class ArrayInitialization {
    public static void main(String[] args) {
        // One d array 
        int[] d1=new int[6];
        System.out.println(d1);
        System.out.println(d1[0]);

        //Two d array
        int[][] d2=new int[6][5];
        System.out.println(d2);
        System.out.println(d2[0][1]);


        int[][] d3=new int[6][];
        System.out.println(d3);
        // System.out.println(d3[0]);                // return the "null"
        // System.out.println(d3[0][0]);             // give the runtime exception

        // By default all the values get initialise by 0, which can later be reinitialised

        int[] z=new int[6];
        z[0]=10;
        z[1]=20;
        z[2]=30;
        z[3]=40;
        z[4]=50;
        z[5]=60;
        // z[6]=70;                           // will give runtime exception :array index out of bound
        // z[5.1]=33;                         // will give the possible loss of precision compile time error
    }
}
