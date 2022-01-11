package gilded.roses.objects;

public abstract class Item {

	protected String name;
	protected int sellIn;
	protected int quality;
	//ajouter value

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}
	public int getSellIn() {
		return sellIn;
	}
	public int getQuality() {
		return quality;
	}
	
	public abstract void update();

	public void borderQuality(){
		if(this.quality<0){
			quality=0;
		}
		if(this.quality>50){
			quality=50;
		}
	}
	
}
