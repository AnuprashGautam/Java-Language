import DefaultClassExample;

public class DefaultClassAccess2
{
    // Trying to access the default class (DefaultClassExample) from inside the package (defpack).
    public static void main(String[] args) {
        DefaultClassExample obj=new DefaultClassExample();
        obj.add(10, 20);
    }
}