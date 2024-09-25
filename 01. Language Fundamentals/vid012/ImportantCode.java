public class ImportantCode {

    static void m1(int[]...  arr)
    {
        for(int[] x1: arr)
            System.out.println(x1[0]);
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={10,20,30};
        int[] c={100,200,300};

        m1();
        System.out.println("-----------------------");
        m1(a);
        System.out.println("-----------------------");
        m1(a,b);
        System.out.println("-----------------------");
        m1(a,b,c,new int[]{10000,20000,30000});
    }
}
