package gilded.roses.objects;

public class LegendaryItem extends Item {
	
	public LegendaryItem(String name) {
		setName(name);
		setQuality(LEGENDARY_ITEM_QUALITY);
		setSellIn(LEGENDARY_ITEM_SELLIN);
	}
	
	@Override
	public void newDay() {
		return;
	}

}
