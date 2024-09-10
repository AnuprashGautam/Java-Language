package vid001;

public class Exercise
{
    public enum Month
    {
        Jan, Feb, Mar, April, May, June, July, Aug, Sep, Oct, Nov, Dec
    }

    public static void main(String[] args) {
        Month mon=Month.Jan;

        switch(mon)
        {
            case Jan:
                System.out.println("First Month");
                break;
            
            case Dec:
                System.out.println("Last Month");
                break;
            
            default:
                System.out.println("Other month");
                break;
        }

        for(Month m: Month.values())
        {
            System.out.println(m);
        }
    }
}