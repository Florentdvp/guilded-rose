package gilded.roses.objects.inventory;

import gilded.roses.objects.Item;
import gilded.roses.objects.ItemRepository;

public class InventoryInteractor {
    private ItemRepository repository;

    public InventoryInteractor(ItemRepository repository) {
        this.repository = repository;
    }

    public void updateQuality(){
        Item[] items = this.repository.getInventory();
        for(Item i : items){
            i.update();
        }
        this.repository.saveInventory(items);
    }

    public Item[] getInventory(){
        return this.repository.getInventory();
    }
}
