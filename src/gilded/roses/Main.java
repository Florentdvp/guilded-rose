package gilded.roses;

import java.util.ArrayList;

import gilded.roses.objects.Item;

public class Main {
	
	public static ArrayList<Item> items = new ArrayList<Item>();
	
	public static void main(String[] args) {
		
	}
	
	public static void updateQuality() {
		
		if (!items.isEmpty()) {
			for (Item i : items)
				i.newDay();
		}
		
	}

}
