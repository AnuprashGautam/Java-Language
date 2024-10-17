class A{

}

class B
{

}

class C 
{

}


public class newInstanceExample {

    // @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Object o=Class.forName(args[0]).newInstance();
        System.out.println("The object was created for this class:"+o.getClass().getName());
    }
}
