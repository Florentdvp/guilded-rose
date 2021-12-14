package gilded.roses.objects;

public class GrowingItem extends Item {
	
	public GrowingItem(String name, short sellIn, short quality) {
		setName(name);
		setSellIn((sellIn >= 0 ? sellIn : 0));
		setQuality((quality >= Item.Qualite_Mini ? (quality <= Item.Qualite_Max ? quality : Item.Qualite_Max) : Item.Qualite_Mini));
	}
	
	@Override
	public void newDay() {
		if (getSellIn() > 0)
			setSellIn((short) (getSellIn()-Item.Valeur_Descendante));
		
		super.setQuality((short) (getQuality() + Item.Valeur_Montante <= Item.Qualite_Max ?
				getQuality()+Item.Valeur_Montante : Item.Qualite_Max));
	}

}
