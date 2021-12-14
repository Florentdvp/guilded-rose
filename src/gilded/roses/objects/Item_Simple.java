package gilded.roses.objects;

public class Item_Simple extends Item {
	
	public Item_Simple(String name, int sellIn, int quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.qualiteMini ? (quality <= Item.qualiteMax ? quality : Item.qualiteMax) : Item.qualiteMini));
	}

	@Override
	public void newDay() {
		if (getSellIn() > 0) {
			setSellIn((int) (getSellIn()-Item.valeurDescendante));
			setQuality((int) (getQuality() - Item.valeurDescendante >= 0 ?
					getQuality()-Item.valeurDescendante : 0));
		} else {
			setQuality((int) (getQuality() - Item.valeurDescendante >= 0 ?
					getQuality()-(Item.valeurDescendante *2) : 0));
		}
	}
	
}
