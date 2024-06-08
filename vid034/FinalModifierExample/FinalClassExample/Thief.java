//final key word makes all the methods final automatically after applying on the class, but it does not work on the variables.


final class Bank
{
    static int rate=50000;
    void gold()
    {
        rate=60000;
        System.out.println("Gold");
        System.out.println("Rate :"+rate);
    }

    void silver()
    {
        System.out.println("Silver");
    }
}
public class Thief extends Bank                     // Will give the compile time error because the class is final and ultimately all the methods in it too.
{
    
}
