package gilded.roses.objects;

public class LegendaryItem extends Item {
	
	public LegendaryItem(String name) {
		setName(name);
		setQuality(Qualite_Item_Legendaire);
		setSellIn(Vente_Item_Legendaire);
	}
	
	@Override
	public void newDay() {
		return;
	}

}
