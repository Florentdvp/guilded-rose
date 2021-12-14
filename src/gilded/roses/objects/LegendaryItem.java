package gilded.roses.objects;

public class LegendaryItem extends Item {
	
	public LegendaryItem(String name) {
		super.setName(name);
		super.setQuality(Qualite_Item_Legendaire);
		super.setSellIn(Vente_Item_Legendaire);
	}
	
	@Override
	public void newDay() {
		return;
	}

}
