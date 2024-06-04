# Note: newInstance() method which was previously contained inside the `java.lang.Class` class has been deprecated in the Java 9 and onward versions, so the following code won't compile.

``` java
class Student
{

}
class Customer
{

}

public class newInstanceExample
{
    public static void main(String[] args) throws Exception
    {
        Object o=Class.forName(args[0]).newInstance();
        System.out.println("Object created for:"+o.getClass().getName());
    }
}
```