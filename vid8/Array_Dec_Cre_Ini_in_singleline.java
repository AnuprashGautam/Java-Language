package vid8;

public class Array_Dec_Cre_Ini_in_singleline {
    public static void main(String[] args) {
        // First approach
        int[] x;                //Declaration
        x=new int[4];           //Creation

        x[0]=10;                //initialisation
        x[1]=20;                //initialisation
        x[2]=30;                //initialisation
        x[3]=40;                //initialisation

        
        //Second approach 

        int[] y={10,20,30,40};
        int[][] z={{10,20},{30,40,50}};
        int[][][] a={{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
    }
}
