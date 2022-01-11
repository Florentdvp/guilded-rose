package gilded.roses.objects.items;

import gilded.roses.objects.Item;

public class LimitedItem extends Item {

	public LimitedItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void update() {
		this.sellIn--;
		this.quality++;
		if(sellIn<=10){
			this.quality++;
		}
		if(sellIn<=5){
			this.quality++;
		}
		if(sellIn<0){
			this.quality=0;
		}
		this.borderQuality();
	}

}
