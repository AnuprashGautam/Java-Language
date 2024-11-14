interface AtmMachine
{
    void withdraw(int amount);
    void deposit(int amount);
    void enquiry();
}

abstract class AxisBank implements AtmMachine
{
    public void  withdraw(int amount)
    {
        System.out.println("Withdrawn amount:"+amount);
    }

    public void deposit(int amount)
    {
        System.out.println("Deposited amount:"+amount);
    }
}

class RBI extends AxisBank
{
    public void enquiry()
    {
        System.out.println("Please try again.");
    }
}