package g;

public class gg {
    public static void main(String[] args) {
        DepositAccount dAccount1 = new DepositAccount(20);
        System.out.println(dAccount1.getId());

        DepositAccount dAccount2 = new DepositAccount("12345");
        System.out.println(dAccount2.getId());
    }
}
class Account<T>
{
    private T _id;
    T getId(){return _id;}
    Account(T id)
    {
        _id = id;
    }
}

class DepositAccount<T> extends Account<T>{

    DepositAccount(T id){
        super(id);
    }
}