package gilded.roses.objects;

public class GrowingItem extends Item {

	public GrowingItem(String name, int sellIn, int quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.qualiteMini ? (quality <= Item.qualiteMax ? quality : Item.qualiteMax) : Item.qualiteMini));
	}

	@Override
	public void newDay() {
		if (getSellIn() > 0)
			setSellIn((int) (getSellIn()-Item.valeurDescendante));

		setQuality((int) (getQuality() + Item.valeurMontante <= Item.qualiteMax ?
				getQuality()+Item.valeurMontante : Item.qualiteMax));
	}

}
