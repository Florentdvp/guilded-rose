package gilded.roses.objects.items;

import gilded.roses.objects.Item;

public class GrowingItem extends Item {

	public GrowingItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void update() {
		this.sellIn--;
		this.quality++;
		this.borderQuality();
	}
}
