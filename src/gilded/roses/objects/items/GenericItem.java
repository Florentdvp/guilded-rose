package gilded.roses.objects.items;

import gilded.roses.objects.Item;

public class GenericItem extends Item {

	public GenericItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void update() {
		if(sellIn<0){
			this.quality-=2;
		}
		this.sellIn--;
		this.quality--;
		this.borderQuality();
	}
	
}
