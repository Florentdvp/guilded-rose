package gilded.roses.objects;

public abstract class Item {
	
	public static final int valeurDescendante = 1;
	public static final int valeurMontante = 1;
	public static final int qualiteMax = 50;
	public static final int qualiteMini = 0;
	
	public static final int qualiteItemLegendaire = 80;
	public static final int venteItemLegendaire = -1;

	
	private String name;
	private int sellIn;
	private int quality;
	
	public void setName(String nom) {
		name = nom;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSellIn(int sellin) {
		sellIn = sellin;
	}
	
	public int getSellIn() {
		return sellIn;
	}

	public void setQuality(int qualite) {
		quality = qualite;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public abstract void newDay();
	
}
