package gilded.roses.objects;

public class LimitedItem extends Item {
	
	public LimitedItem(String name, int sellIn, int quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.qualiteMini ? (quality <= Item.qualiteMax ? quality : Item.qualiteMax) : Item.qualiteMini));
	}
	
	@Override
	public void newDay() {
		if (getSellIn() > 0) {
			setSellIn((int) (getSellIn()-Item.valeurDescendante));
			
			if (getSellIn() > 10) {
				setQuality((int) (getQuality() + Item.valeurMontante <= Item.qualiteMax ?
						getQuality()+Item.valeurMontante : Item.qualiteMax));
			}
			else if (getSellIn() > 5) {
				setQuality((int) (getQuality() + (Item.valeurMontante *2) <= Item.qualiteMax ?
						getQuality()+(Item.valeurMontante *2) : Item.qualiteMax));
			}
			else {
				setQuality((int) (getQuality() + (Item.valeurMontante *3) <= Item.qualiteMax ?
						getQuality()+(Item.valeurMontante *3) : Item.qualiteMax));
			}
		}
		else
			setQuality((int) 0);
	}

}
