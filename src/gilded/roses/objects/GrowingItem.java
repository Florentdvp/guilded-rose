package gilded.roses.objects;

public class GrowingItem extends Item {

	public GrowingItem(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.qualiteMini ? (quality <= Item.qualiteMax ? quality : Item.qualiteMax) : Item.qualiteMini));
	}

	@Override
	public void newDay() {
		if (getSellIn() > 0)
			setSellIn((short) (getSellIn()-Item.valeurDescendante));

		setQuality((short) (getQuality() + Item.valeurMontante <= Item.qualiteMax ?
				getQuality()+Item.valeurMontante : Item.qualiteMax));
	}

}
