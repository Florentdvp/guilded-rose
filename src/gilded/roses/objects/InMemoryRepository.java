package gilded.roses.objects;

import gilded.roses.objects.items.GenericItem;
import gilded.roses.objects.items.GrowingItem;
import gilded.roses.objects.items.LegendaryItem;
import gilded.roses.objects.items.LimitedItem;

public class InMemoryRepository implements ItemRepository{
    private Item items[]= {
            new LegendaryItem("Sulfuras", 20, 60),
            new GrowingItem("test", 1, 1),
            new GenericItem("Common", 10, 0),
            new LimitedItem("Aged Brie", 10, 5),
    };

    @Override
    public Item[] getInventory() {
        return this.items;
    }

    @Override
    public void saveInventory(Item[] items) {
        this.items=items;
    }
}
