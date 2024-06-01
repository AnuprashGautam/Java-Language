public class Exercise {
    
    public enum Month
    {
        Jan, Feb, Mar, May, June, July, Aug, Sep, Oct, Nov, Dec
    }

    public static void main (String [] args)
    {
        Month mon =Month.May;
        System.out.println("Current Month is:"+mon);

        switch (mon) {
            case May:
                System.out.println("5th month");
                break;
            case June:
                System.out.println("6th month");
                break;
            default:
                System.out.println("Another month!");
                break;
        }
    }

}
