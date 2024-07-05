public abstract class InterfaceImplementation implements BankInterface{

    public void deposit()
    {
        System.out.println("Money was deposited.");
    }
    public static void main(String[] args) {
        System.out.println(balance_amount);
        System.out.println(deposit_amount);
    }
    
}

class SubInterfaceImplementation extends InterfaceImplementation
{
    public void withdraw()
    {
        System.out.println("Money was withdrewed.");
    }
}
