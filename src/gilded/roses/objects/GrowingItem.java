package gilded.roses.objects;

public class GrowingItem extends Item {
	
	public GrowingItem(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.MIN_QUALITY ? (quality <= Item.MAX_QUALITY ? quality : Item.MAX_QUALITY) : Item.MIN_QUALITY));
	}
	
	@Override
	public void newDay() {
		if (getSellIn() > 0)
			setSellIn((short) (getSellIn()-Item.DECREASE_VALUE));
		
		super.setQuality((short) (getQuality() + Item.INCREASE_VALUE <= Item.MAX_QUALITY ?
				getQuality()+Item.INCREASE_VALUE : Item.MAX_QUALITY));
	}

}
