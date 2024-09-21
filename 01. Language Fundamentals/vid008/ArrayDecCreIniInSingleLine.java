class ArrayDecCreIniInSingleLine {
    public static void main(String[] args) {
        int[] x={10,20,30,40,50};                       //Short hand way to Dec+Instantiate+Initialise an arrray.
        System.out.println(x.length);


        int[][][] array3d={{{1,2,3},{4,5,6}},
                            {{7,8,9},{10,11,12}}};
        
        System.out.println(array3d[1][0][1]);
        System.out.println(array3d[0][0][1]);


        //But we can not break down the above short hand way into pieces.

        // int[] x;
        // x={10,20,30,40,50};              //CE: illegal start of expression


        //length property just shows the length of the base array.

        System.out.println(array3d.length);
    }
}
