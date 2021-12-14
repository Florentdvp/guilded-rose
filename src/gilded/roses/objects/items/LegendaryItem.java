package gilded.roses.objects.items;

import gilded.roses.objects.Item;

public class LegendaryItem extends Item {

	public LegendaryItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.quality=80;
	}

	@Override
	public void update() {
		return;
	}

}
