package gilded.roses;

import java.util.ArrayList;

import gilded.roses.objects.InMemoryRepository;
import gilded.roses.objects.Item;
import gilded.roses.objects.inventory.InventoryInteractor;

public class Main {

	public static void main(String[] args) {
		InventoryInteractor interactor = new InventoryInteractor(new InMemoryRepository());
		interactor.updateQuality();
		for(Item i : interactor.getInventory()){
			System.out.println(i.getQuality());
		}
	}

}
