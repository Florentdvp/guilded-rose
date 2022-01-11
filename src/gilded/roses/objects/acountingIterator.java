package gilded.roses.objects;

public class acountingIterator {
    private BalanceRepository repository;

    public acountingIterator(BalanceRepository repository) {
        this.repository = repository;
    }

    public int getBalance(){
        return this.repository.getBalance();
    }
}
