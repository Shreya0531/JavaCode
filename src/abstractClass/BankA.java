package abstractClass;

public class BankA extends Bank
{
    @Override
    public void getBalance()
    {
        System.out.println("$100 deposited");
    }
}
