public class SingletonClassSecondApproach {
    private static SingletonClassSecondApproach s=null;

    private SingletonClassSecondApproach(){

    }

    public static SingletonClassSecondApproach getSingletonClassSecondApproach(){
        if(s==null){
            s=new SingletonClassSecondApproach();
        }
        return s;
    }

    public static void main(String[] args) {
        SingletonClassSecondApproach s1=SingletonClassSecondApproach.getSingletonClassSecondApproach();
        SingletonClassSecondApproach s2=SingletonClassSecondApproach.getSingletonClassSecondApproach();
        SingletonClassSecondApproach s3=SingletonClassSecondApproach.getSingletonClassSecondApproach();
        SingletonClassSecondApproach s4=SingletonClassSecondApproach.getSingletonClassSecondApproach();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
