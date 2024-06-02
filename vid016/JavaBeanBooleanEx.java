public class JavaBeanBooleanEx 
{
    private boolean empty;

    //setter method
    public void setEmpty(boolean b)
    {
        this.empty=b;
    }

    //getter method
    public boolean isEmpty()                         //We can use getEmpty instead of isEmpty. But isEmpty is recommended as it makes more sense.
    {
        return empty;
    }
}
