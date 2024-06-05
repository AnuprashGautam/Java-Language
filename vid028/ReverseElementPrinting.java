public class ReverseElementPrinting  {
    public static void main(String[] args) {
        // This code is near to immpossible to make with for each loop as that has not been designed to print the elements in reverse order.
        int[][][] array = { { { 10, 20, 30 },
                              { 40, 50, 60 } },

                            { { 70, 80, 90 },
                              { 100, 110, 120 } } };

        for (int i=array.length-1;i>=0;i--)
        {
            for (int j=array[i].length-1;j>=0;j--)
            {
              for (int k=array[i][j].length-1;k>=0;k--)
              {
                System.out.println(array[i][j][k]);
              }
            }
        }
    }
}
