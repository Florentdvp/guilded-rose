package gilded.roses.objects;

public abstract class Item {
	
	public static final short Valeur_Descendante = 1;
	public static final short Valeur_Montante = 1;
	public static final short Qualite_Max = 50;
	public static final short Qualite_Mini = 0;
	
	public static final short Qualite_Item_Legendaire = 80;
	public static final short Vente_Item_Legendaire = -1;

	
	private String name;
	private short sellIn;
	private short quality;
	
	public void setName(String nom) {
		name = nom;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSellIn(short sellin) {
		sellIn = sellin;
	}
	
	public short getSellIn() {
		return sellIn;
	}

	public void setQuality(short qualite) {
		quality = qualite;
	}
	
	public short getQuality() {
		return quality;
	}
	
	public abstract void newDay();
	
}
