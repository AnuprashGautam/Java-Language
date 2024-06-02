public class Enhancement {
    public static void main(String[] args) {
        
        // Binary  literals 
        int i = 0B1010;
        System.out.println(i);

        // Underscore in numeric literals
        int j = 1_00_000;
        // int k = 0x1_00_00_;             // will give the error
        // int l = 0x_1_00_00;             // will give the error

        double d = 1_00_000.0;
        // double e = 1_00_000_.0;            // will give the error
        // double f = 1_00_000._0;            // will give the error


        System.out.println(d);
    }
}
