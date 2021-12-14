package gilded.roses.objects;

public class LegendaryItem extends Item {
	
	public LegendaryItem(String name) {
		super.setName(name);
		super.setQuality(LEGENDARY_ITEM_QUALITY);
		super.setSellIn(LEGENDARY_ITEM_SELLIN);
	}
	
	@Override
	public void newDay() {
		return;
	}

}
