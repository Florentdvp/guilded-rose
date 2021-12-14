package gilded.roses.objects;

public class Item_Simple extends Item {
	
	public Item_Simple(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.Qualite_Mini ? (quality <= Item.Qualite_Max ? quality : Item.Qualite_Max) : Item.Qualite_Mini));
	}

	@Override
	public void newDay() {
		if (getSellIn() > 0) {
			setSellIn((short) (getSellIn()-Item.Valeur_Descendante));
			setQuality((short) (getQuality() - Item.Valeur_Descendante >= 0 ?
					getQuality()-Item.Valeur_Descendante : 0));
		} else {
			setQuality((short) (getQuality() - Item.Valeur_Descendante >= 0 ?
					getQuality()-(Item.Valeur_Descendante *2) : 0));
		}
	}
	
}
