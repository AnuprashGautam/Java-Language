class AnonymousArrayExample 
{

    public static void sum(int[] x) 
    {
        int total = 0;
        for (int x1 : x)
        {
            total = total + x1;
            System.out.println("The sum is :" + total);
        }
    }
    public static void main(String[] args) 
    {
        int[] z = new int[5];
        z[0] = 10;
        z[1] = 'a';
        byte b = 30;
        z[2] = b; 
        short s = 40;
        z[3] = s; 
        // z[4] = 50l;              //Compile time error: possible loss of precision

        // Anonymous arrays are used for the one time usage only.
        // new int[]  {1,2,3,4,5};             
        // new int[5]  {1,2,3,4,5};                    // We can't specify the anonymous arrya size.      
        // new int[][] {{1,2,3,4},{5,6,7,8}};          //We can make multi diemnsional anonymous arrays too.
        
        sum(new int[] {1,2,3,4,5});


        //Even we can assign the name to an annonymous array further that turn it into a named array.

        int [] arr=new int[]{1,2,4,5};            //no more a anonymous array.
    }
}
