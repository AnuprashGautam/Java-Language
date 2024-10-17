public class ForEachLoopExample {
    public static void main(String[] args) {
        // It is used to access the elements of array and collection.
        int[][][] array = { { { 10, 20, 30 },
                              { 40, 50, 60 } },

                            { { 70, 80, 90 },
                              { 100, 110, 120 } } };

        for (int[][] x1:array)
        {
            for(int[] x2:x1)
            {
                for(int x3:x2)
                {
                    System.out.println(x3);
                }
            }
        }

    }
}
