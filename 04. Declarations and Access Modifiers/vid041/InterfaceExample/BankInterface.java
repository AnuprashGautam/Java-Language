interface BankInterface
{
    int balance_amount=100;      // Interface variables are public, static and final.
    int deposit_amount=100;

    void deposit();              // Interface methods are public and abstract.
    void withdraw();
}