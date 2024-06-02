public class length_vs_length_method {
    public static void main(String[] args) {

                                                         //final
        //length= property
        int[] x= new int[5];
        // System.out.println(x.length());        //will give the compile time error
        System.out.println(x.length);


        
                                                         //final()
        String s1="helllo";
        // System.out.println(s1.length);         //will give the compile time error
        System.out.println(s1.length());

        String[] s={"A","AA","AAA"};
        System.out.println(s.length);
        // System.out.println(s.length());         // Will give the compile time error
        System.out.println(s[0].length());
        // System.out.println(s[0].length);        // Will give the compile time error

        int[][] arr=new int[5][6];
        System.out.println(arr.length);            
        System.out.println(arr[0].length);            
    }
}
