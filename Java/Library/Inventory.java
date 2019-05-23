import java.util.ArrayList;

public class Inventory implements Updateable {
	
	private ArrayList <Item> itemsIn;
	private ArrayList <Item> itemsOut;
	
	public Inventory() {
		this.itemsIn = new ArrayList<Item>();
		this.itemsOut = new ArrayList<Item>();
		
	}

}
