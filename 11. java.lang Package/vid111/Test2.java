public class Test2 {
    static Integer I;
    public static void main(String[] args) {
        
        Integer X=new Integer(10);
        Integer Y=new Integer(10);
        System.out.println(X==Y);

        Integer X1=new Integer(10);
        Integer Z=10;
        System.out.println(X1==Z);

        Integer X2=10;
        Integer Y2=10;
        System.out.println(X2==Y2);

        Integer X3=100;
        Integer Y3=100;
        System.out.println(X3==Y3);

        
        Integer X4=1000;
        Integer Y4=1000;
        System.out.println(X4==Y4);

        Integer X5=127;
        Integer Y5=127;
        System.out.println(X5==Y5);

        Integer X6=Integer.valueOf(19);
        Integer Y6=Integer.valueOf(19);
        System.out.println(X6==Y6);

        Double D1=10.0;
        Double D2=10.0;
        System.out.println(D1==D2);

    }
}
