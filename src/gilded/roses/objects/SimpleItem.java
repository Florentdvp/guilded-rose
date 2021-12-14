package gilded.roses.objects;

public class SimpleItem extends Item {
	
	public SimpleItem(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.MIN_QUALITY ? (quality <= Item.MAX_QUALITY ? quality : Item.MAX_QUALITY) : Item.MIN_QUALITY));
	}
	
	@Override
	public void newDay() {
		if (getSellIn() > 0) {
			setSellIn((short) (getSellIn()-Item.DECREASE_VALUE));
			setQuality((short) (getQuality() - Item.DECREASE_VALUE >= 0 ?
					getQuality()-Item.DECREASE_VALUE : 0));
		} else {
			setQuality((short) (getQuality() - Item.DECREASE_VALUE >= 0 ?
					getQuality()-(Item.DECREASE_VALUE*2) : 0));
		}
	}
	
}
