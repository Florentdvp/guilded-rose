package gilded.roses.objects;

public class LegendaryItem extends Item {
	
	public LegendaryItem(String name) {
		setName(name);
		setQuality(qualiteItemLegendaire);
		setSellIn(venteItemLegendaire);
	}
	
	@Override
	public void newDay() {
		return;
	}

}
