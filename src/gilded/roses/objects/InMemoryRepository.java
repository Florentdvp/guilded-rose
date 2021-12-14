package gilded.roses.objects;

public class InMemoryRepository implements ItemRepository{
    private Item items[]= {
            new LegendaryItem("Sulfuras"),
            new GrowingItem("test", 1, 1),
    };

    @Override
    public Item[] getInventory() {
        return new Item[0];
    }

    @Override
    public void saveInventory(Item[] items) {

    }
}
