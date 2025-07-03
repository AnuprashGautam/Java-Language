public class SingletonClassExample {
    private static SingletonClassExample s=new SingletonClassExample();

    private SingletonClassExample(){

    }

    public static SingletonClassExample getSingletonClassExample(){
        return s;
    }
    public static void main(String[] args) {
        Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();
        Runtime r3=Runtime.getRuntime();
        Runtime r4=Runtime.getRuntime();


        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        System.out.println(r3.hashCode());
        System.out.println(r4.hashCode());

        SingletonClassExample s1=SingletonClassExample.getSingletonClassExample();
        SingletonClassExample s2=SingletonClassExample.getSingletonClassExample();
        SingletonClassExample s3=SingletonClassExample.getSingletonClassExample();
        SingletonClassExample s4=SingletonClassExample.getSingletonClassExample();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
