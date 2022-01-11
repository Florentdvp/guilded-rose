package gilded.roses.objects;

public interface ItemRepository {
    public Item[] getInventory();
    public void saveInventory(Item[] items);
}
