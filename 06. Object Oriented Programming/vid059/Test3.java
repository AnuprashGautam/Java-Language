class A{
    int x=777;
}

class B extends A{
    int x=888;
}

class C extends B{
    int x=999;  
}

public class Test3 {
    public static void main(String[] args) {
        C c=new C();

        System.out.println(c.x);
        System.out.println(((B)c).x);
        System.out.println(((A)((B)c)).x);
    }
}
