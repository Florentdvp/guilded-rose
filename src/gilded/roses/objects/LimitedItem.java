package gilded.roses.objects;

public class LimitedItem extends Item {
	
	public LimitedItem(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.MIN_QUALITY ? (quality <= Item.MAX_QUALITY ? quality : Item.MAX_QUALITY) : Item.MIN_QUALITY));
	}
	
	@Override
	public void newDay() {
		if (getSellIn() > 0) {
			
			setSellIn((short) (getSellIn()-Item.DECREASE_VALUE));
			
			if (getSellIn() > 10) {
				setQuality((short) (getQuality() + Item.INCREASE_VALUE <= Item.MAX_QUALITY ?
						getQuality()+Item.INCREASE_VALUE : Item.MAX_QUALITY));
			} else if (getSellIn() > 5) {
				setQuality((short) (getQuality() + (Item.INCREASE_VALUE*2) <= Item.MAX_QUALITY ?
						getQuality()+(Item.INCREASE_VALUE*2) : Item.MAX_QUALITY));
			} else {
				setQuality((short) (getQuality() + (Item.INCREASE_VALUE*3) <= Item.MAX_QUALITY ?
						getQuality()+(Item.INCREASE_VALUE*3) : Item.MAX_QUALITY));
			}
			
		} else
			setQuality((short) 0);
	}

}
