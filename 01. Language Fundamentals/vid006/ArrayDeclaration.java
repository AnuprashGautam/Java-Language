public class ArrayDeclaration {
                                              // One dimensional array declaration
    int[] x;
    int []y;
    int z[];

    // int[6] x; // will give the compile time error

                                              // Two dimensional array declaration
    int[][]  a;
    int[]  b[];
    int c[][];
    int []d[];

    // int[]  []e,[]f;            
    // Will give the compile time error. Because except the first variable, we can't specify the dimension before the variable name

    //int[] []g,[]h,[]i; // This is the incorrect way to declare the array

                                              // Three dimensional array declaration
    int[][][]  j;
    int[][]  k[];
    int[]  l[][];
    int m[][][];
    int []n[][];
    int o[][][];

    // int[] []p,[]q,[]r; // This is the incorrect way to declare the array
}
