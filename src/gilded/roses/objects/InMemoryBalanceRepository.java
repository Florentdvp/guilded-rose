package gilded.roses.objects;
import gilded.roses.objects.BalanceRepository;

public class InMemoryBalanceRepository implements BalanceRepository{
    private int balance = 1000;

    public int getBalance(){
        return this.balance;
    }

    @Override
    public void saveBalance() { //ajouter int balance dans les ()
        this.balance=balance;
    }

}
