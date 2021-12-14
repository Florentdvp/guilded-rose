package gilded.roses.objects;

public abstract class Item {
	
	public static final short valeurDescendante = 1;
	public static final short valeurMontante = 1;
	public static final short qualiteMax = 50;
	public static final short qualiteMini = 0;
	
	public static final short qualiteItemLegendaire = 80;
	public static final short venteItemLegendaire = -1;

	
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
