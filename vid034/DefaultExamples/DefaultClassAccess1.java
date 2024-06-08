import defpack.DefaultClassExample;

public class DefaultClassAccess1 
{
    // Deafult class can be accessed only within the same package and not outside the package. DefaultClassExample is in defpack package. So we can't access it here.
    public static void main(String[] args) {
        DefaultClassExample obj=new DefaultClassExample();
        obj.add(10, 20);
    }
}
