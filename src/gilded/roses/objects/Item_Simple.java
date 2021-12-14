package gilded.roses.objects;

public class Item_Simple extends Item {
	
	public Item_Simple(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.qualiteMini ? (quality <= Item.qualiteMax ? quality : Item.qualiteMax) : Item.qualiteMini));
	}

	@Override
	public void newDay() {
		if (getSellIn() > 0) {
			setSellIn((short) (getSellIn()-Item.valeurDescendante));
			setQuality((short) (getQuality() - Item.valeurDescendante >= 0 ?
					getQuality()-Item.valeurDescendante : 0));
		} else {
			setQuality((short) (getQuality() - Item.valeurDescendante >= 0 ?
					getQuality()-(Item.valeurDescendante *2) : 0));
		}
	}
	
}
