package gilded.roses.objects;

public abstract class Item {
	
	public static final short DECREASE_VALUE = 1;
	public static final short INCREASE_VALUE = 1;
	public static final short MAX_QUALITY = 50;
	public static final short MIN_QUALITY = 0;
	
	public static final short LEGENDARY_ITEM_QUALITY = 80;
	public static final short LEGENDARY_ITEM_SELLIN = -1;
	
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
